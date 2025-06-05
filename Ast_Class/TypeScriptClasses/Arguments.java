package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Arguments extends Node {
    private ArrayList<Argument> arguments = new ArrayList<>();

    public ArrayList<Argument> getArguments() {
        return arguments;
    }

    public void setArguments(ArrayList<Argument> arguments) {
        this.arguments = arguments;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
