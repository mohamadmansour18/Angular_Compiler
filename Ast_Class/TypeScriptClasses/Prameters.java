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
    }
}
