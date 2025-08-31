package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class ObjectPropertyNode extends Node {
    private boolean spread;     // ...expr
    private String key;         // IDENTIFIER أو STRING (مع علاماتها)
    private boolean shorthand;  // IDENTIFIER فقط بدون قيمة
    private Node expression;    // قيمة الخاصية أو التعبير الممدود (...expr)

    public boolean isSpread() { return spread; }
    public void setSpread(boolean spread) { this.spread = spread; }

    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }

    public boolean isShorthand() { return shorthand; }
    public void setShorthand(boolean shorthand) { this.shorthand = shorthand; }

    public Node getExpression() { return expression; }
    public void setExpression(Node expression) { this.expression = expression; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        if (spread) {
            return "..." + (expression != null ? expression.getValue() : "");
        }
        if (shorthand) {
            return key;
        }
        return key + ": " + (expression != null ? expression.getValue() : "");
    }

    public String generate(GenContext ctx) {
        // helper: إزالة ';' النهائية وتنظيف الفراغات
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        // ---------------------------
        // 1) حالة الـ spread: ...expr
        // ---------------------------
        if (spread) {
            String v = (expression != null) ? clean.apply(expression.generate(ctx)) : "";
            if (v.isEmpty()) v = "{}"; // احتياط: تجنّب ...undefined
            return "..." + v;
        }

        // -----------------------------------------
        // 2) حالة shorthand: IDENTIFIER بدون قيمة
        //    نحافظ على اسم الخاصية الأصلي. لو تغيّر اسم المتغير بعد resolve،
        //    نوسّع shorthand إلى key: resolvedName
        // -----------------------------------------
        if (shorthand) {
            String original = (key != null) ? key : "";
            String resolved = (original.isEmpty()) ? "" : ctx.resolve(original);

            if (original.isEmpty()) return ""; // لا شيء نولّده

            if (resolved.equals(original)) {
                // لا يوجد اختلاف → نبقي shorthand
                return original;
            } else {
                // اختلف اسم المتغير (بسبب إعادة تسمية/ظلال) → وسّع إلى key: resolved
                return original + ": " + resolved;
            }
        }

        // -----------------------------------------
        // 3) حالة key: expr  (الـ key إمّا IDENTIFIER أو STRING)
        //    ملاحظة: لا نُمرّر الـ key عبر resolve؛ اسم الخاصية يبقى كما في المصدر.
        // -----------------------------------------
        String k = (key != null) ? key : "";
        String v = (expression != null) ? clean.apply(expression.generate(ctx)) : "undefined";
        return k + ": " + v;
    }
}
