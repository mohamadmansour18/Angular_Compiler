package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Parameter extends Node {

    private String visibility; // public / private / protected / null
    private String name;
    private Type type;

    public Parameter(String visibility, String name, Type type) {
        this.visibility = visibility;
        this.name = name;
        this.type = type;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        String vis = (visibility != null) ? visibility + " " : "";
        return vis + name + ": " + type.getValue();
    }

}
