package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class VarDeclareStatement extends Statment{
    private VarDeclare varDeclare;

    public VarDeclare getVarDeclare() {
        return varDeclare;
    }

    public void setVarDeclare(VarDeclare varDeclare) {
        this.varDeclare = varDeclare;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        if(varDeclare!=null) {
            varDeclare.accept(astVisitor);
        }
    }
}
