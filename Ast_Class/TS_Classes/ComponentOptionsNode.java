package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;
import java.util.List;

public class ComponentOptionsNode extends Node {
    private SelectorPropertyNode selector;        // لازم وجوده
    private StandalonePropertyNode standalone;    // اختياري
    private ImportsPropertyNode importsProp;      // اختياري
    private TemplatePropertyNode template;        // اختياري

    public SelectorPropertyNode getSelector() {
        return selector;
    }

    public void setSelector(SelectorPropertyNode selector) {
        this.selector = selector;
    }

    public StandalonePropertyNode getStandalone() {
        return standalone;
    }

    public void setStandalone(StandalonePropertyNode standalone) {
        this.standalone = standalone;
    }

    public ImportsPropertyNode getImportsProp() {
        return importsProp;
    }

    public void setImportsProp(ImportsPropertyNode importsProp) {
        this.importsProp = importsProp;
    }

    public TemplatePropertyNode getTemplate() {
        return template;
    }

    public void setTemplate(TemplatePropertyNode template) {
        this.template = template;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        // نُعيد محتوى الكائن بدون الأقواس {} — لأن @Component هو من يضيف الأقواس
        StringBuilder sb = new StringBuilder();
        int count = 0;

        if (selector != null) {
            sb.append(selector.getValue());
            count++;
        }
        if (standalone != null) {
            if (count > 0) sb.append(", ");
            sb.append(standalone.getValue());
            count++;
        }
        if (importsProp != null) {
            if (count > 0) sb.append(", ");
            sb.append(importsProp.getValue());
            count++;
        }
        if (template != null) {
            if (count > 0) sb.append(", ");
            sb.append(template.getValue());
        }

        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // helper: إزالة ';' النهائية وتنظيف الفراغات
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        List<String> parts = new ArrayList<>();

        if (selector != null) {
            String v = clean.apply(selector.generate(ctx));
            if (!v.isEmpty()) parts.add(v);
        }

        if (standalone != null) {
            String v = clean.apply(standalone.generate(ctx));
            if (!v.isEmpty()) parts.add(v);
        }

        if (importsProp != null) {
            String v = clean.apply(importsProp.generate(ctx));
            if (!v.isEmpty()) parts.add(v);
        }

        if (template != null) {
            String v = clean.apply(template.generate(ctx));
            if (!v.isEmpty()) parts.add(v);
        }

        return String.join(", ", parts);
    }
}
