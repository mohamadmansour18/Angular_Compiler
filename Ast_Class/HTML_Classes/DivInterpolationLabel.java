package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;

public class DivInterpolationLabel extends Node implements DivContentNode {

    // هل هناك DOLAR? قبل {{ ... }}  (أي "${{ ... }}")
    private boolean hasDollar;

    // التعبير داخل الأقواس
    private Node expr;

    public boolean isHasDollar() {
        return hasDollar;
    }

    public void setHasDollar(boolean hasDollar) {
        this.hasDollar = hasDollar;
    }

    public Node getExpr() {
        return expr;
    }

    public void setExpr(Node expr) {
        this.expr = expr;
    }


    @Override
    public String getValue() {
        String inner = (expr != null) ? expr.getValue() : "";
        return (hasDollar ? "$" : "") + "{{" + inner + "}}";
    }


    @Override
    public String generate(GenContext ctx) {
        String inner = (expr != null) ? expr.generate(ctx) : "";
        if (inner == null) inner = "";
        inner = inner.trim();

        if (inner.endsWith(";")) inner = inner.substring(0, inner.length() - 1).trim();
        return (hasDollar ? "$" : "") + "{{" + inner + "}}";
    }

}
