package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class TypeAliasStatement1 extends Node implements Stetment{
    private String name;            // IDENTIFIER
    private ObjectTypeNode object;  // من قاعدة objectType

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public ObjectTypeNode getObject() { return object; }
    public void setObject(ObjectTypeNode object) { this.object = object; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("type ");
        if (name != null) sb.append(name);
        sb.append(" = ");
        if (object != null) sb.append(object.getValue());
        sb.append(";");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        return " ";
    }
}
