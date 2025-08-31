package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class UnaryExprNode extends Node {
    private ArrayList<String> operators = new ArrayList<>(); // مثل !, +, -
    private Node operand; // asExpression النهائي

    public java.util.ArrayList<String> getOperators() { return operators; }
    public void setOperators(java.util.ArrayList<String> operators) { this.operators = operators; }

    public Node getOperand() { return operand; }
    public void setOperand(Node operand) { this.operand = operand; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (String op : operators) sb.append(op);
        if (operand != null) sb.append(operand.getValue());
        return sb.toString();
    }
}
