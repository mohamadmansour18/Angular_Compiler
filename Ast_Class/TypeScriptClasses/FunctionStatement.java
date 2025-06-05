package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class FunctionStatement extends Statment{
    private Function function;

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        if(function!=null)
            function.accept(astVisitor);
    }



    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }
}
