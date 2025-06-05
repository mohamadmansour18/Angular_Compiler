package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class LoopStatments extends Node {
    private While anwhile;
    private For afor;
    private ArrayList<Statements> statements=new ArrayList<>();

    public While getAnwhile() {
        return anwhile;
    }

    public void setAnwhile(While anwhile) {
        this.anwhile = anwhile;
    }

    public For getAfor() {
        return afor;
    }

    public void setAfor(For afor) {
        this.afor = afor;
    }

    public ArrayList<Statements> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statements> statements) {
        this.statements = statements;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }
}
