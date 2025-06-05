package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public  class EqualBaseData extends Node {
    public BaseData getBaseData() {
        return baseData;
    }

    public void setBaseData(BaseData baseData) {
        this.baseData = baseData;
    }

    private BaseData baseData;
    public void accept(AST_Visitor astVisitor){
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("EqualBaseData Node");
        System.out.println("Child Count"+this.getChildeCount());
if(baseData!=null)
{
    System.out.println("Equal Value:");
    baseData.accept(astVisitor);
}
        System.out.println("**********************************************");

    }
}
