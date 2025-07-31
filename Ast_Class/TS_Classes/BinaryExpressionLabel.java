package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class BinaryExpressionLabel extends Node implements ExpressionNode{

    private ExpressionNode left;
    private String operator;
    private ExpressionNode right;

    public ExpressionNode getLeft() {
        return left;
    }

    public ExpressionNode getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }

    public void setLeft(ExpressionNode left) {
        this.left = left;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setRight(ExpressionNode right) {
        this.right = right;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "(" + left.getValue() + " " + operator + " " + right.getValue() + ")";
    }

}
