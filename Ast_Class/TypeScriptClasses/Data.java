package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Data extends Node {
    private ArrowFunction arrowFunction;
    private BaseData baseData;

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public BaseData getBaseData() {
        return baseData;
    }

    public void setBaseData(BaseData baseData) {
        this.baseData = baseData;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }

    StringBuilder s = new StringBuilder();
    String st = "";

    @Override
    public String getValue() {
        if (arrowFunction != null) {
            st = arrowFunction.getValue();
        }
        if (baseData != null) {
            st = baseData.getValue();
        }
        return st;
    }
}
