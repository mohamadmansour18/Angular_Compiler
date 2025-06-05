package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Body extends Node {
    private ArrayList<Statements> statements = new ArrayList<>();
    private Return aReturn;

    public ArrayList<Statements> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statements> statements) {
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

    @Override
    public String getValue() {
        return "";
    }
}
