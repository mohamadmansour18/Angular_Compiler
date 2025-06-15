package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Prameter extends Node {
    private String name;
    private Type type;
    private Equal equal;
    private ObjectsLable objectsLable;

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

    public ObjectsLable getObjectsLable() {
        return objectsLable;
    }

    public void setObjectsLable(ObjectsLable objectsLable) {
        this.objectsLable = objectsLable;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
