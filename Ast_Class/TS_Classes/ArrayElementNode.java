package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
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
}
