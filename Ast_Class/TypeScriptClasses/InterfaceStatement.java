package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class InterfaceStatement extends Node implements Stetment{
    private String interfaceName;
    private ArrayList<InterfaceBody> interfaceBodies = new ArrayList<>();

    public String getName() {
        return interfaceName;
    }

    public void setName(String name) {
        this.interfaceName = name;
    }

    public ArrayList<InterfaceBody> getInterfaceBodies() {
        return interfaceBodies;
    }

    public void setInterfaceBodies(ArrayList<InterfaceBody> interfaceBodies) {
        this.interfaceBodies = interfaceBodies;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
