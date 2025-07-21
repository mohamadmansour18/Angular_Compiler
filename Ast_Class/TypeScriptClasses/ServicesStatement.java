package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ServicesStatement extends Node implements Stetment  {
    private String injectable;
    private ObjectsLable objectsLable;

    public String getInjectable() {
        return injectable;
    }

    public void setInjectable(String injectable) {
        this.injectable = injectable;
    }

    public ObjectsLable getObjectsLable() {
        return objectsLable;
    }

    public void setObjectsLable(ObjectsLable objectsLable) {
        this.objectsLable = objectsLable;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}

