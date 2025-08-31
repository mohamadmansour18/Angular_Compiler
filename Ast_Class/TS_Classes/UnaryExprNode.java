package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
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

    @Override
    public String generate(GenContext ctx) {

        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        String base = (operand != null) ? clean.apply(operand.generate(ctx)) : "";
        if (base.isEmpty()) base = "undefined";

        StringBuilder prefix = new StringBuilder();
        if (operators != null) {
            for (String op : operators) {
                if (op != null && !op.isBlank()) {
                    prefix.append(op.trim());
                }
            }
        }

        return prefix.toString() + base;
    }
}
