package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class FunctionStatement extends Statment{
    private Function function;

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
