package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class ArrayElementNode extends Node {
    private boolean spread; // true عند وجود ELLIPSIS (...)
    private Node expr;

    public boolean isSpread() { return spread; }
    public void setSpread(boolean spread) { this.spread = spread; }

    public Node getExpr() { return expr; }
    public void setExpr(Node expr) { this.expr = expr; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }


    @Override
    public String getValue() {
        String v = (expr != null) ? expr.getValue() : "";
        return spread ? ("..." + v) : v;
    }

    @Override
    public String generate(GenContext ctx) {
        // تنظيف: إزالة ';' النهائية إن وُجدت
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        String v = (expr != null) ? clean.apply(expr.generate(ctx)) : "";

        if (spread) {
            if (v.isEmpty()) v = "[]";
            return "..." + v;
        }

        return v;
    }
}
