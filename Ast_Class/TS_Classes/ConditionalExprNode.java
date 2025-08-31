package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
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
}
