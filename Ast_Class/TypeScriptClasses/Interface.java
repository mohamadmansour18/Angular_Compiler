package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Interface extends Node {
    private String name;
    private ArrayList<InterfaceBody> interfaceBodies = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<InterfaceBody> getInterfaceBodies() {
        return interfaceBodies;
    }

    public void setInterfaceBodies(ArrayList<InterfaceBody> interfaceBodies) {
        this.interfaceBodies = interfaceBodies;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("Interface Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (name != null) {
            System.out.println("interface name: " + name);
        }
        if (interfaceBodies != null) {
            System.out.println("interface body");
            for (InterfaceBody i : interfaceBodies) {
                i.accept(astVisitor);
            }
        }
        System.out.println("**********************************************");

    }
}

