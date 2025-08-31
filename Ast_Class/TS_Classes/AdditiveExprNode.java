package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class AdditiveExprNode extends Node {
    // مثال: a + b - c  -> operands = [a, b, c], ops = ["+", "-"]
    private ArrayList<Node> operands = new ArrayList<>();
    private ArrayList<String> ops = new ArrayList<>();

    public ArrayList<Node> getOperands() {
        return operands;
    }

    public void setOperands(ArrayList<Node> operands) {
        this.operands = operands;
    }

    public ArrayList<String> getOps() {
        return ops;
    }

    public void setOps(ArrayList<String> ops) {
        this.ops = ops;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }


    @Override
    public String getValue() {
        if (operands.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(operands.get(0).getValue());
        for (int i = 0; i < ops.size(); i++) {
            sb.append(" ").append(ops.get(i)).append(" ");
            sb.append(operands.get(i + 1).getValue());
        }
        return sb.toString();
    }
}
