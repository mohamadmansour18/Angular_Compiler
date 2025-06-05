package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class AngularTemplet extends Info {
    private Templet templet;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);

    }

    public Templet getTemplet() {
        return templet;
    }

    public void setTemplet(Templet templet) {
        this.templet = templet;
    }
}
