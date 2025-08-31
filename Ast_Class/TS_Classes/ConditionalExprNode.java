package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class ConditionalExprNode extends Node {
    private Node condition;   // nullishExpr
    private Node thenExpr;    // expr (اختياري)
    private Node elseExpr;    // expr (اختياري)

    public Node getCondition() { return condition; }
    public void setCondition(Node condition) { this.condition = condition; }

    public Node getThenExpr() { return thenExpr; }
    public void setThenExpr(Node thenExpr) { this.thenExpr = thenExpr; }

    public Node getElseExpr() { return elseExpr; }
    public void setElseExpr(Node elseExpr) { this.elseExpr = elseExpr; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        if (thenExpr == null || elseExpr == null) {
            return (condition != null) ? condition.getValue() : "";
        }
        return condition.getValue() + " ? " + thenExpr.getValue() + " : " + elseExpr.getValue();
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

        // 1) الشرط (nullishExpr في القاعدة)
        String cond = clean.apply(condition != null ? condition.generate(ctx) : "");
        if (thenExpr == null || elseExpr == null) {
            // لا توجد صيغة ?: → أعد الشرط كما هو (تعبير عادي)
            return cond.isEmpty() ? "" : cond;
        }

        // 2) الفروع then / else
        String thenJs = clean.apply(thenExpr.generate(ctx));
        String elseJs = clean.apply(elseExpr.generate(ctx));
        if (thenJs.isEmpty()) thenJs = "undefined";
        if (elseJs.isEmpty()) elseJs = "undefined";

        return (cond.isEmpty() ? "undefined" : cond) + " ? " + thenJs + " : " + elseJs;
    }
}
