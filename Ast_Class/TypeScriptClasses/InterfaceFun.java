package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class InterfaceFun extends Node {
    private String name;
    private Prameters prameters;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prameters getPrameters() {
        return prameters;
    }

    public void setPrameters(Prameters prameters) {
        this.prameters = prameters;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("Interface function body Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (name != null) {
            System.out.println("interface function name: " + name);
        }
        if (prameters != null) {
            System.out.println("interface function parameter:");
            prameters.accept(astVisitor);
        }
        if (type != null) {
            System.out.println("interface function type: " + type);
        }
        System.out.println("**********************************************");

    }
}
