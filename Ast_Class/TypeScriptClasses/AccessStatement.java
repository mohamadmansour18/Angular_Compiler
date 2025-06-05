package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class AccessStatement extends Statment{
    private Access access;

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        if(access!=null)
            access.accept(astVisitor);
    }


    public Access getAccess() {
        return access;
    }


    public void setAccess(Access access) {
        this.access = access;
    }
}
