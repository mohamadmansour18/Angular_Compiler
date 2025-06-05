package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class TemplateStatement extends Statment{
    private Templet templet;

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }


    public Templet getTemplet() {
        return templet;
    }


    public void setTemplet(Templet templet) {
        this.templet = templet;
    }
}
