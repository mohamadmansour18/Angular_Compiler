package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ReturnStmtLabel extends Node implements StatementNode{
    private ExpressionNode expression; // ممكن تكون null

    public ExpressionNode getExpression() {
        return expression;
    }

    public void setExpression(ExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return expression != null ? "return " + expression.getValue() + ";" : "return;";
    }
}
