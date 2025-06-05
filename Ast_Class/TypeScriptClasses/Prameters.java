package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Prameters extends Node {
    private ArrayList<Prameter> prameters = new ArrayList<>();

    public ArrayList<Prameter> getPrameters() {
        return prameters;
    }

    public void setPrameters(ArrayList<Prameter> prameters) {
        this.prameters = prameters;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("Parameters Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (prameters != null) {
            for (Prameter p : prameters) {
                p.accept(astVisitor);
            }
        }
        System.out.println("**********************************************");

    }
}
