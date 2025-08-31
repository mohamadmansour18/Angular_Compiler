package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class AsExpressionNode extends Node {
    private Node base;                           // postfixExpr
    private ArrayList<TypeRefNode> types = new ArrayList<>(); // (as T)*

    public Node getBase() { return base; }
    public void setBase(Node base) { this.base = base; }

    public java.util.ArrayList<TypeRefNode> getTypes() { return types; }
    public void setTypes(java.util.ArrayList<TypeRefNode> types) { this.types = types; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }


    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (base != null) sb.append(base.getValue());
        for (TypeRefNode t : types) {
            sb.append(" as ").append(t.getValue());
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // helper: إزالة ';' النهائية وتنظيف الفراغات
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        if (base == null) return "";
        String core = clean.apply(base.generate(ctx));
        return core;
    }
}
