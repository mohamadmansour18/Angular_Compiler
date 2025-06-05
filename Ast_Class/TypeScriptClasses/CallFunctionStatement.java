package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class CallFunctionStatement extends Statment{
    private CullFunction cullFunction;

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }


    public CullFunction getCullFunction() {
        return cullFunction;
    }


    public void setCullFunction(CullFunction cullFunction) {
        this.cullFunction = cullFunction;
    }
}
