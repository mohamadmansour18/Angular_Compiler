package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
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

        StringBuilder sb = new StringBuilder();
        String first = clean.apply(operands.get(0) != null ? operands.get(0).generate(ctx) : "");
        if (first.isEmpty()) first = "0";
        sb.append(first);

        for (int i = 0; i < ops.size(); i++) {
            String op = ops.get(i);
            String rhs = "";
            if (i + 1 < operands.size() && operands.get(i + 1) != null) {
                rhs = clean.apply(operands.get(i + 1).generate(ctx));
            }
            if (rhs.isEmpty()) rhs = "0";

            sb.append(" ").append(op).append(" ").append(rhs);
        }

        return sb.toString();
    }

}
