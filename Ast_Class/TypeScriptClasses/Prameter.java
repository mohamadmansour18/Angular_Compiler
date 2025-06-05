package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Prameter extends Node {
    private String name;
    private Type type;
    private Equal equal;
    private Objects objects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Equal getEqual() {
        return equal;
    }

    public void setEqual(Equal equal) {
        this.equal = equal;
    }

    public Objects getObjects() {
        return objects;
    }

    public void setObjects(Objects objects) {
        this.objects = objects;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("Parameter Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (name != null) {
            System.out.println("parameter name: " + name);
        }
        if (type != null) {
            System.out.println("paratmeter type: ");
            type.accept(astVisitor);
        }
        if (equal != null) {
            System.out.println("parameter default value: ");
            equal.accept(astVisitor);
        }
        if (objects != null) {
            System.out.println("parameter object type: ");
            objects.accept(astVisitor);
        }
        System.out.println("**********************************************");

    }
}
