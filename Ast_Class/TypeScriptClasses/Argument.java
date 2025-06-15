package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Argument extends Node {
    private String name;
    private EqualBaseData equalBaseData;
    private ObjectsLable objectsLable;
    private BaseData baseData;
    private ArrowFunction arrowFunction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EqualBaseData getEqualBaseData() {
        return equalBaseData;
    }

    public void setEqualBaseData(EqualBaseData equalBaseData) {
        this.equalBaseData = equalBaseData;
    }

    public ObjectsLable getObjectsLable() {
        return objectsLable;
    }

    public void setObjectsLable(ObjectsLable objectsLable) {
        this.objectsLable = objectsLable;
    }

    public BaseData getBaseData() {
        return baseData;
    }

    public void setBaseData(BaseData baseData) {
        this.baseData = baseData;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public void accept(AST_Visitor astVisitor){
        astVisitor.visit(this);
    }

    @Override
    public String getValue() {
        return "";
    }
}
