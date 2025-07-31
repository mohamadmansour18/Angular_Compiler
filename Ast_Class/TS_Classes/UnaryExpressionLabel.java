package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class UnaryExpressionLabel extends Node implements ExpressionNode {

    private String operator;
    private ExpressionNode expression;

    public String getOperator() {
        return operator;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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
        return operator + expression.getValue();
    }
}
