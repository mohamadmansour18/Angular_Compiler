package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Return extends Node {
    private String Return;
    private BaseData baseData;

    public String getReturn() {
        return Return;
    }

    public void setReturn(String aReturn) {
        Return = aReturn;
    }

    public BaseData getBaseData() {
        return baseData;
    }

    public void setBaseData(BaseData baseData) {
        this.baseData = baseData;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("Return Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (baseData != null) {
            System.out.println("date return");
            baseData.accept(astVisitor);
        }
        System.out.println("**********************************************");

    }
}
