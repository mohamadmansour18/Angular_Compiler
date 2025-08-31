package Code_Generation;

import java.util.*;

/**
 * GenContext: سياق توليد الكود
 * - إدارة النطاقات/الأسماء المؤقتة/الـ indent
 * - تجميع وحدات الـ Prelude حسب الحاجة (features)
 * - كل requireXxx() تضيف الوحدة مرة واحدة فقط مع تعليق [WHY]
 */
public class GenContext {

    // ---------- إدارة أسماء مؤقتة، ليبلز، وإزاحة ----------
    private int temp = 0;
    private int label = 0;
    private int indent = 0;

    private final Deque<Map<String, String>> scopes = new ArrayDeque<>();

    // نجمع هنا كل مقاطع الـ prelude (JS) التي سنحقنها أعلى الملف
    private final StringBuilder prelude = new StringBuilder();

    // مجموعة الميزات التي تم حقنها بالفعل (لمنع التكرار)
    private final Set<String> features = new HashSet<>();

    public GenContext() {
        pushScope();
    }

    // ---------- Scopes ----------
    public void pushScope() { scopes.push(new HashMap<>()); }
    public void popScope()  { scopes.pop(); }
    public void declare(String name, String target) { scopes.peek().put(name, target); }
    public String resolve(String name) {
        for (var s : scopes) if (s.containsKey(name)) return s.get(name);
        return name;
    }

    // ---------- Temps / Labels ----------
    public String newTemp() { return "_t" + (temp++); }
    public String newLabel(String base) { return "_L_" + base + "_" + (label++); }

    // ---------- Indentation ----------
    public String ind() { return "  ".repeat(Math.max(0, indent)); }
    public void in()    { indent++; }
    public void out()   { indent = Math.max(0, indent - 1); }

    // ---------- Prelude ----------
    public void addPrelude(String code) {
        prelude.append(code).append("\n");
    }
    public String getPrelude() {
        return prelude.toString();
    }

    // =========================================================
    //                  متطلبات الـ Angular
    // =========================================================

    /** CORE: مساحة أسماء موحّدة __rt لتجميع كل الهيلبرز */
    public void requireCore() {
        if (features.add("core")) {
            addPrelude(String.join("\n",
                    "// [WHY] نحتاج CORE لإنشاء مساحة أسماء موحّدة (__rt) نجمع بداخلها كل الهيلبرز",
                    "//       بدون تلويث النطاق العام (window) وتجنّب تصادم الأسماء.",
                    "const __rt = (function(){",
                    "  const api = {};",
                    "  // داخلي: تجميع تبعيات الـ computed أثناء التقييم",
                    "  api.__activeDeps = null; // Set<signal>",
                    "  return api;",
                    "})();"
            ));
        }
    }

    /** signal: بديل بسيط لِـ Angular signals (signal<T>) */
    public void requireSignal() {
        requireCore();
        if (features.add("signal")) {
            addPrelude(String.join("\n",
                    "// [WHY] signal: نحتاجها لدعم state تفاعلي (مثل PRODUCTS_STORE.products.update(...))",
                    "//      وتحديث الواجهة تلقائيًا عند تغيّر القيمة.",
                    "(function(){",
                    "  __rt.signal = function(initial){",
                    "    let _v = initial;",
                    "    const subs = new Set(); // Set<fn(v)>",
                    "",
                    "    // الدالة نفسها هي الـ getter",
                    "    function s(){",
                    "      // تتبّع التبعيات لـ computed: أي signal يتم قراءته أثناء حساب computed يُضاف كاعتماد",
                    "      if (__rt.__activeDeps) __rt.__activeDeps.add(s);",
                    "      return _v;",
                    "    }",
                    "",
                    "    s.set = v => { _v = v; subs.forEach(fn => fn(_v)); };",
                    "    s.update = fn => { _v = fn(_v); subs.forEach(fn => fn(_v)); };",
                    "    s.subscribe = fn => { subs.add(fn); fn(_v); return { unsubscribe: () => subs.delete(fn) }; };",
                    "    return s;",
                    "  };",
                    "})();"
            ));
        }
    }

    /** computed: اشتقاقات تعتمد على signals وتُعاد حسابها تلقائيًا */
    public void requireComputed() {
        requireSignal(); // يعتمد على تتبّع signals
        if (features.add("computed")) {
            addPrelude(String.join("\n",
                    "// [WHY] computed: نحتاجها لحسابات مشتقّة (مثل list = computed(() => PRODUCTS_STORE.products()))",
                    "//      وإعادة الحساب عند تغيّر أي signal قرأته.",
                    "(function(){",
                    "  __rt.computed = function(fn){",
                    "    let val;",
                    "    let depUnsubs = []; // unsubscribe من الإشعارات القديمة",
                    "    const listeners = new Set();",
                    "",
                    "    function resubscribe(deps){",
                    "      depUnsubs.forEach(u => { try { u.unsubscribe && u.unsubscribe(); } catch(_){} });",
                    "      depUnsubs = [];",
                    "      deps.forEach(sig => {",
                    "        const sub = sig.subscribe(() => {",
                    "          recompute();",
                    "          listeners.forEach(l => l(val));",
                    "        });",
                    "        depUnsubs.push(sub);",
                    "      });",
                    "    }",
                    "",
                    "    function recompute(){",
                    "      const prev = __rt.__activeDeps;",
                    "      __rt.__activeDeps = new Set();",
                    "      try { val = fn(); } finally {",
                    "        const deps = __rt.__activeDeps;",
                    "        __rt.__activeDeps = prev;",
                    "        resubscribe(deps);",
                    "      }",
                    "    }",
                    "",
                    "    recompute();",
                    "    function c(){ return val; }",
                    "    c.subscribe = (fn) => { listeners.add(fn); fn(val); return { unsubscribe: () => listeners.delete(fn) }; };",
                    "    c.recompute = recompute;",
                    "    return c;",
                    "  };",
                    "})();"
            ));
        }
    }

    /** renderList: بديل مبسط لـ *ngFor */
    public void requireRenderList() {
        requireCore();
        if (features.add("renderList")) {
            addPrelude(String.join("\n",
                    "// [WHY] renderList: نحتاج بديل لـ *ngFor لعرض قائمة المنتجات وتحديثها عند تغيّرها.",
                    "(function(){",
                    "  __rt.renderList = function(container, listLike, renderItem){",
                    "    function paint(items){",
                    "      container.innerHTML = '';",
                    "      for (const it of items) {",
                    "        container.appendChild(renderItem(it));",
                    "      }",
                    "    }",
                    "    const get = typeof listLike === 'function' ? listLike : () => listLike;",
                    "    paint(get());",
                    "    if (get.subscribe) get.subscribe(paint);",
                    "  };",
                    "})();"
            ));
        }
    }

    /** renderIf: بديل مبسط لـ *ngIf */
    public void requireRenderIf() {
        requireComputed(); // سنحوّل الشرط إلى computed لضمان التحديث
        if (features.add("renderIf")) {
            addPrelude(String.join("\n",
                    "// [WHY] renderIf: نحتاج بديل لـ *ngIf لإظهار/إخفاء أجزاء من الواجهة (product() / editMode()).",
                    "(function(){",
                    "  __rt.renderIf = function(container, condFn, renderTrue, renderFalse){",
                    "    const c = __rt.computed(condFn);",
                    "    function mount(node){",
                    "      container.innerHTML = '';",
                    "      if (node) container.appendChild(node);",
                    "    }",
                    "    function update(v){",
                    "      mount(v ? (renderTrue && renderTrue()) : (renderFalse ? renderFalse() : null));",
                    "    }",
                    "    update(c());",
                    "    c.subscribe(update);",
                    "  };",
                    "})();"
            ));
        }
    }

    /** bindAttr: ربط صفات DOM مثل [src] بقيمة مشتقة من signals */
    public void requireBindAttr() {
        requireComputed();
        if (features.add("bindAttr")) {
            addPrelude(String.join("\n",
                    "// [WHY] bindAttr: نحتاج لربط خصائص مثل [src] أو [href] بقيم تتغيّر مع state (signals/computed).",
                    "(function(){",
                    "  __rt.bindAttr = function(el, attr, getter){",
                    "    const c = __rt.computed(getter);",
                    "    function apply(v){",
                    "      el.setAttribute(attr, v == null ? '' : String(v));",
                    "    }",
                    "    apply(c());",
                    "    c.subscribe(apply);",
                    "    return { refresh: () => apply(c()) };",
                    "  };",
                    "})();"
            ));
        }
    }

    /** on: ربط أحداث مثل (click) أو (error) */
    public void requireOn() {
        requireCore();
        if (features.add("on")) {
            addPrelude(String.join("\n",
                    "// [WHY] on: نحتاجه لربط الأحداث (click/error/input...) كما في (click) و (error) و غيرها.",
                    "(function(){",
                    "  __rt.on = function(el, ev, handler){",
                    "    el.addEventListener(ev, handler);",
                    "  };",
                    "})();"
            ));
        }
    }

    /** ngModel-like: ربط إدخالات الفورم بقيم/حالة (one/two-way) */
    public void requireNgModel() {
        requireComputed(); // نستخدم computed لتحديث العرض
        if (features.add("ngModel")) {
            addPrelude(String.join("\n",
                    "// [WHY] ngModel: نحتاج ربطًا بسيطًا لمداخل النموذج [(ngModel)] مع حالة form (one/two-way).",
                    "(function(){",
                    "  __rt.bindInput = function(el, getValue, setValue){",
                    "    // عرض القيمة الحالية",
                    "    const c = __rt.computed(getValue);",
                    "    function apply(v){ el.value = v == null ? '' : String(v); }",
                    "    apply(c());",
                    "    c.subscribe(apply);",
                    "    // تحديث الحالة عند إدخال المستخدم",
                    "    el.addEventListener('input', function(){",
                    "      setValue(el.type === 'number' ? Number(el.value) : el.value);",
                    "    });",
                    "  };",
                    "})();"
            ));
        }
    }

    /** Router: توجيه بسيط (hash-based) مع params و query ودعم router-outlet / navigateByUrl / routerLink */
    public void requireRouter() {
        requireCore();
        if (features.add("router")) {
            addPrelude(String.join("\n",
                    "// [WHY] Router: نحتاج توجيهًا بسيطًا لواجهات: '' و '/products' و '/products/:ids' و تحويل '**'،",
                    "//      مع method navigateByUrl، وقراءة params/query، و mount في router-outlet.",
                    "(function(){",
                    "  const routes = []; // { path, regex, keys[], render }",
                    "  let outlet = null;",
                    "",
                    "  function pathToRegex(path){",
                    "    const keys = [];",
                    "    const re = path",
                    "      .replace(/\\//g, '\\\\/')",
                    "      .replace(/:(\\w+)/g, (_, k) => { keys.push(k); return '([^/]+)'; });",
                    "    return { regex: new RegExp('^' + re + '$'), keys };",
                    "  }",
                    "",
                    "  function parseHash(){",
                    "    const raw = location.hash.replace(/^#/, '');",
                    "    const [p, q] = raw.split('?');",
                    "    const path = p || '/';",
                    "    const query = {};",
                    "    if (q){",
                    "      q.split('&').forEach(kv => {",
                    "        if (!kv) return;",
                    "        const [k,v] = kv.split('=');",
                    "        query[decodeURIComponent(k)] = v != null ? decodeURIComponent(v) : '';",
                    "      });",
                    "    }",
                    "    return { path, query };",
                    "  }",
                    "",
                    "  function match(path){",
                    "    for (const r of routes){",
                    "      const m = path.match(r.regex);",
                    "      if (m){",
                    "        const params = {};",
                    "        r.keys.forEach((k, i) => params[k] = decodeURIComponent(m[i+1] || ''));",
                    "        return { route: r, params };",
                    "      }",
                    "    }",
                    "    return null;",
                    "  }",
                    "",
                    "  function render(){",
                    "    if (!outlet) return;",
                    "    const { path, query } = parseHash();",
                    "    let mm = match(path);",
                    "    if (!mm){",
                    "      // wildcard: إن وُجد مسار '**' نحاول تحويله",
                    "      const wild = routes.find(r => r.path === '**');",
                    "      if (wild && wild.redirectTo){",
                    "        __rt.router.navigateByUrl(wild.redirectTo);",
                    "        return;",
                    "      }",
                    "      outlet.innerHTML = '<div>Not Found</div>';",
                    "      return;",
                    "    }",
                    "    outlet.innerHTML = '';",
                    "    const node = mm.route.render({ params: mm.params, query });",
                    "    if (node) outlet.appendChild(node);",
                    "    // أخطر المستمعين بتغيّر المسار (ActivatedRoute بديل مبسّط)",
                    "    routeListeners.forEach(fn => fn({ path, params: mm.params, query }));",
                    "  }",
                    "",
                    "  const routeListeners = new Set();",
                    "",
                    "  __rt.router = {",
                    "    mount(outletEl){ outlet = outletEl; window.addEventListener('hashchange', render); render(); },",
                    "    define(defs){",
                    "      defs.forEach(d => {",
                    "        if (d.redirectTo){",
                    "          routes.push({ path: d.path || '**', regex: /.*/, keys: [], redirectTo: d.redirectTo });",
                    "        } else {",
                    "          const pr = pathToRegex(d.path);",
                    "          routes.push({ path: d.path, regex: pr.regex, keys: pr.keys, render: d.render });",
                    "        }",
                    "      });",
                    "    },",
                    "    navigateByUrl(path){ location.hash = path; },",
                    "    linkTo(path){ return '#'+path.replace(/^#/, ''); },",
                    "    onChange(fn){ routeListeners.add(fn); return { unsubscribe: () => routeListeners.delete(fn) }; },",
                    "    current(){",
                    "      const { path, query } = parseHash();",
                    "      const mm = match(path);",
                    "      return { path, params: mm ? mm.params : {}, query };",
                    "    }",
                    "  };",
                    "})();"
            ));
        }
    }

    /** RouterLink: مساعد لإسناد [routerLink] وإنشاء href + منع refresh كامل */
    public void requireRouterLink() {
        requireRouter();
        if (features.add("routerLink")) {
            addPrelude(String.join("\n",
                    "// [WHY] RouterLink: نحتاج بديلًا لـ [routerLink] لبناء href والتصفّح داخل الـ SPA بدون إعادة تحميل.",
                    "(function(){",
                    "  __rt.routerLink = function(anchorEl, mk){",
                    "    function apply(){",
                    "      const path = (typeof mk === 'function') ? mk() : String(mk || '/');",
                    "      anchorEl.setAttribute('href', __rt.router.linkTo(path));",
                    "    }",
                    "    apply();",
                    "    anchorEl.addEventListener('click', function(ev){",
                    "      ev.preventDefault();",
                    "      const href = anchorEl.getAttribute('href') || '#/';",
                    "      const path = href.replace(/^#/, '');",
                    "      __rt.router.navigateByUrl(path);",
                    "    });",
                    "    return { refresh: apply };",
                    "  };",
                    "})();"
            ));
        }
    }
}
