package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ReturnStatementNode extends Node {
    private Node expr; // اختياري

    public Node getExpr() {
        return expr;
    }

    public void setExpr(Node expr) {
        this.expr = expr;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("return");
        if (expr != null) {
            sb.append(" ").append(expr.getValue());
        }
        sb.append(";");
        return sb.toString();
    }

}
