package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class IfStatement extends Statment{
    private If_statment ifStatment;

    public If_statment getIfStatment() {
        return ifStatment;
    }

    public void setIfStatment(If_statment ifStatment) {
        this.ifStatment = ifStatment;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
