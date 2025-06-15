package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class PrintStatement extends Node implements Stetment {
    private String string;
    private Arguments arguments;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
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
