package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class PrintStatement extends Node implements Stetment {
    private String ID;
    private Arguments arguments;

    public String getID() {
        return ID;
    }

    public void setID(String string) {
        this.ID = string;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    @Override
    public void accept(AST_Visitor astVisitor){
        astVisitor.visit(this);
    }
}
