package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Services extends Node {
    private String injectable;
    private Objects objects;

    public String getInjectable() {
        return injectable;
    }

    public void setInjectable(String injectable) {
        this.injectable = injectable;
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
        System.out.println("services Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (injectable != null) {
            System.out.println("using services");
        }
        if (objects != null) {
            System.out.println("services content");
            objects.accept(astVisitor);
        }
        System.out.println("**********************************************");
    }
}
