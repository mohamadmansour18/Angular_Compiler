package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Class extends Node {
    private String name;
    private ArrayList<ClassBody> classBodies=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ClassBody> getClassBodies() {
        return classBodies;
    }

    public void setClassBodies(ArrayList<ClassBody> classBodies) {
        this.classBodies = classBodies;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
