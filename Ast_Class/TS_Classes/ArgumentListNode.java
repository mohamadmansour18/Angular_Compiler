package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ArgumentListNode extends Node {
    private ArrayList<Node> args = new ArrayList<>();

    public ArrayList<Node> getArgs() {
        return args;
    }

    public void setArgs(ArrayList<Node> args) {
        this.args = args;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.size(); i++) {
            sb.append(args.get(i).getValue());
            if (i < args.size() - 1) sb.append(", ");
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

        if (args == null || args.isEmpty()) return "";

        java.util.List<String> parts = new java.util.ArrayList<>();
        for (Node a : args) {
            if (a == null) continue;
            String v = clean.apply(a.generate(ctx));
            if (v.isEmpty()) v = "undefined";
            parts.add(v);
        }

        return String.join(", ", parts);
    }
}
