package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ServicesStatement extends Node implements Stetment  {
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
    }
}

