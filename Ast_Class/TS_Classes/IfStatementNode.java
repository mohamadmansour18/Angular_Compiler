package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class IfStatementNode extends Node {
    private Node condition;   // expr
    private Node thenBranch;  // block | exprStatement | returnStatement
    private Node elseBranch;  // اختياري: block | exprStatement | returnStatement

    public Node getCondition() { return condition; }
    public void setCondition(Node condition) { this.condition = condition; }

    public Node getThenBranch() { return thenBranch; }
    public void setThenBranch(Node thenBranch) { this.thenBranch = thenBranch; }

    public Node getElseBranch() { return elseBranch; }
    public void setElseBranch(Node elseBranch) { this.elseBranch = elseBranch; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (");
        if (condition != null) sb.append(condition.getValue());
        sb.append(") ");
        if (thenBranch != null) sb.append(thenBranch.getValue());
        if (elseBranch != null) {
            sb.append(" else ");
            sb.append(elseBranch.getValue());
        }
        return sb.toString();
    }
}
