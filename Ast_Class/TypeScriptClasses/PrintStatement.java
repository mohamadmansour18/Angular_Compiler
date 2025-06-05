package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class PrintStatement extends Statment{
    private Print print;

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        if(print!=null) {
            print.accept(astVisitor);
        }
    }
}
