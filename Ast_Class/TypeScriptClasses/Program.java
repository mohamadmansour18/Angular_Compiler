package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Program extends Node {

    private ArrayList<Statements> statements = new ArrayList<>();

    public ArrayList<Statements> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statements> statements) {
        this.statements = statements;
    }

    public void accept(AST_Visitor astVisitor){
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("program Node");
        System.out.println("Child Count" + this.getChildeCount());
        if(statements!=null)
        {
            for (int i = 0; i < statements.size(); i++) {
                statements.get(i).accept(astVisitor);
            }
        }
    }
}


