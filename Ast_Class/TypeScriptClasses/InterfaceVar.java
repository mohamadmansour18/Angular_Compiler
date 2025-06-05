package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class InterfaceVar extends Node {
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
        System.out.println("Interface variable Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (name != null) {
            System.out.println("interface variable name: " + name);
        }
        if (type != null) {
            System.out.println("interface variable type: " + type);
        }
        System.out.println("**********************************************");

    }
}
