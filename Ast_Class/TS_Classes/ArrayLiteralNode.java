package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ArrayLiteralNode extends Node {
    private ArrayList<Node> elements = new ArrayList<>();

    public ArrayList<Node> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Node> elements) {
        this.elements = elements;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < elements.size(); i++) {
            sb.append(elements.get(i).getValue());
            if (i < elements.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // إزالة ';' النهائية إن وُجدت من نواتج العناصر
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        if (elements == null || elements.isEmpty()) {
            return "[]";
        }

        java.util.List<String> parts = new java.util.ArrayList<>();
        for (Node el : elements) {
            if (el == null) continue;
            String v = clean.apply(el.generate(ctx));
            parts.add(v);
        }

        return "[" + String.join(", ", parts) + "]";
    }
}
