package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class NullishExprNode extends Node {
    // operands: expr0 ?? expr1 ?? expr2 ...
    private ArrayList<Node> operands = new ArrayList<>();

    public ArrayList<Node> getOperands() {
        return operands;
    }

    public void setOperands(ArrayList<Node> operands) {
        this.operands = operands;
    }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operands.size(); i++) {
            if (i > 0) sb.append(" ?? ");
            sb.append(operands.get(i).getValue());
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // تنظيف: إزالة ';' النهائية إن وُجدت
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        if (operands == null || operands.isEmpty()) return "";

        java.util.List<String> parts = new java.util.ArrayList<>();
        for (Node op : operands) {
            String v = (op != null) ? clean.apply(op.generate(ctx)) : "";
            if (v.isEmpty()) v = "undefined";
            parts.add(v);
        }

        if (parts.size() == 1) return parts.getFirst();
        return String.join(" ?? ", parts);
    }
}
