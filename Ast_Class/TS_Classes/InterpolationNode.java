package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class InterpolationNode extends Node {
    private boolean hasDollar; // وجود DOLAR?
    private Node expr;         // التعبير داخل الـ {{ }}

    public boolean isHasDollar() { return hasDollar; }
    public void setHasDollar(boolean hasDollar) { this.hasDollar = hasDollar; }

    public Node getExpr() { return expr; }
    public void setExpr(Node expr) { this.expr = expr; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (hasDollar) sb.append("$");
        sb.append("{{");
        if (expr != null) sb.append(expr.getValue());
        sb.append("}}");
        return sb.toString();
    }
}
