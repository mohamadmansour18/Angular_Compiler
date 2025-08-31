package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class NormalPropertyDeclarationNode extends Node {
    private String name;                     // IDENTIFIER
    private GeneralTypeAnnotationNode type;  // اختياري
    private Node initializer;                // assignmentExpr

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public GeneralTypeAnnotationNode getType() { return type; }
    public void setType(GeneralTypeAnnotationNode type) { this.type = type; }

    public Node getInitializer() { return initializer; }
    public void setInitializer(Node initializer) { this.initializer = initializer; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (name != null) sb.append(name);
        if (type != null) sb.append(": ").append(type.getValue()); // type.getValue() يعيد اسم النوع فقط
        sb.append(" = ");
        if (initializer != null) sb.append(initializer.getValue());
        sb.append(";");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {

        String propName = (name != null && !name.isBlank()) ? name : "_field";

        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        String init = (initializer != null) ? clean.apply(initializer.generate(ctx)) : "undefined";

        return propName + " = " + init + ";";
    }
}
