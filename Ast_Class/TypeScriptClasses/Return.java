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
    }
}
