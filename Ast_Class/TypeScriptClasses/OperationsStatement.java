package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class OperationsStatement extends Statment{
    private Operations operations;

    public Operations getOperations() {
        return operations;
    }


    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        if (operations!=null)
        {
            operations.accept(astVisitor);
        }
    }



}
