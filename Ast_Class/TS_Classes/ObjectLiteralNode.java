package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ObjectLiteralNode extends Node {
    private ArrayList<ObjectPropertyNode> properties = new ArrayList<>();

    public ArrayList<ObjectPropertyNode> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<ObjectPropertyNode> properties) {
        this.properties = properties;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < properties.size(); i++) {
            sb.append(properties.get(i).getValue());
            if (i < properties.size() - 1) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // helper: إزالة ';' النهائية إن وُجدت
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        if (properties == null || properties.isEmpty()) {
            return "{}";
        }

        java.util.List<String> parts = new java.util.ArrayList<>();
        for (ObjectPropertyNode p : properties) {
            if (p == null) continue;
            String piece = clean.apply(p.generate(ctx));
            if (!piece.isEmpty()) {
                parts.add(piece);
            }
        }

        return "{" + String.join(", ", parts) + "}";
    }
}
