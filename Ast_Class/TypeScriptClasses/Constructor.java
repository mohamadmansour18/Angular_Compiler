package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Constructor extends Node {
    private String constructor;
    private Prameters prameters;
    private ArrayList<Statements> statements = new ArrayList<>();

    public ArrayList<Statements> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statements> statements) {
        this.statements = statements;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public Prameters getPrameters() {
        return prameters;
    }

    public void setPrameters(Prameters prameters) {
        this.prameters = prameters;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);

    }
}
