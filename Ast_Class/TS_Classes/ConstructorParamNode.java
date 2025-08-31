package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class ConstructorParamNode extends Node {
    private String accessModifier;
    private String name;
    private String typeName;

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();

        if (accessModifier != null) {
            sb.append(accessModifier).append(" ");
        }

        if (name != null) {
            sb.append(name);
        }

        sb.append(": ");

        if (typeName != null) {
            sb.append(typeName);
        }

        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {

        return (name != null && !name.isBlank()) ? name : "arg";
    }
}
