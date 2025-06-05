package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class BodyWithOutCurly extends Node {
    private Statements statements;
    private Return aReturn;

    public Statements getStatements() {
        return statements;
    }

    public void setStatements(Statements statements) {
        this.statements = statements;
    }

    public Return getaReturn() {
        return aReturn;
    }

    public void setaReturn(Return aReturn) {
        this.aReturn = aReturn;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
