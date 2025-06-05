package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class InterfaceStatement extends Statment{
    private Interface anInterface;

    public Interface getAnInterface() {
        return anInterface;
    }


    public void setAnInterface(Interface anInterface) {
        this.anInterface = anInterface;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
