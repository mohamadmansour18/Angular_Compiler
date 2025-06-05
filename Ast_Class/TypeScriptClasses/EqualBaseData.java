package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public  class EqualBaseData extends Node {
    private BaseData baseData;

    public BaseData getBaseData() {
        return baseData;
    }

    public void setBaseData(BaseData baseData) {
        this.baseData = baseData;
    }


    public void accept(AST_Visitor astVisitor){
        astVisitor.visit(this);
    }
}
