package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class AsExpressionNode extends Node {
    private Node base;                           // postfixExpr
    private ArrayList<TypeRefNode> types = new ArrayList<>(); // (as T)*

    public Node getBase() { return base; }
    public void setBase(Node base) { this.base = base; }

    public java.util.ArrayList<TypeRefNode> getTypes() { return types; }
    public void setTypes(java.util.ArrayList<TypeRefNode> types) { this.types = types; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }


    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (base != null) sb.append(base.getValue());
        for (TypeRefNode t : types) {
            sb.append(" as ").append(t.getValue());
        }
        return sb.toString();
    }
}
