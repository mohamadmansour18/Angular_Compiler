package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class AccessLable extends Info {

    private Access access;

    @Override
    public void accept(AST_Visitor ast_Visitor){
        ast_Visitor.visit(this);
        if(access!=null)
            access.accept(ast_Visitor);
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }
}
