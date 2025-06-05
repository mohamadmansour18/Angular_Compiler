package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ObjectsType extends Node {
    private ArrayList<ObjectType> objectTypes = new ArrayList<>();

    public ArrayList<ObjectType> getObjectTypes() {
        return objectTypes;
    }

    public void setObjectTypes(ArrayList<ObjectType> objectTypes) {
        this.objectTypes = objectTypes;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }

    StringBuilder stringBuilder = new StringBuilder();

    @Override
    public String getValue() {
        if (objectTypes != null) {
            for (ObjectType o : objectTypes) {
                stringBuilder.append(o.getValue());
            }
        }
        return stringBuilder.toString();
    }
}
