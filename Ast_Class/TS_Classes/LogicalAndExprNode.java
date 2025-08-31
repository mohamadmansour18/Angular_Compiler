package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class LogicalAndExprNode extends Node {
    // A && B && C -> operands = [A, B, C]
    private ArrayList<Node> operands = new ArrayList<>();

    public ArrayList<Node> getOperands() { return operands; }
    public void setOperands(ArrayList<Node> operands) { this.operands = operands; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operands.size(); i++) {
            if (i > 0) sb.append(" && ");
            sb.append(operands.get(i).getValue());
        }
        return sb.toString();
    }
}
