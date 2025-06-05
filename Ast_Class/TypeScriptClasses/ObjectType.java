package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ObjectType extends Node {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("ObjectType Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (name != null) {
            System.out.println("object type type : " + name);
        }
        if (type != null) {
            System.out.println("object type: " + type);
        }
        System.out.println("**********************************************");

    }

    StringBuilder s = new StringBuilder();

    @Override
    public String getValue() {
        if (name != null) {
            s.append(name);
        }
        if (type != null) {
            s.append(type);
        }
        return s.toString();
    }
}