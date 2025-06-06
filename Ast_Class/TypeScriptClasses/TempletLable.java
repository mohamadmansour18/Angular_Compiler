package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class TempletLable extends Info {
    private Templet templet;

    public Templet getTemplet() {
        return templet;
    }

    public void setTemplet(Templet templet) {
        this.templet = templet;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if (templet!=null)
            templet.accept(ast_Visitor);
    }
}
