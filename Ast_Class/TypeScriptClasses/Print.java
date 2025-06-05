package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Print extends Node {
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

    public void accept(AST_Visitor astVisitor){
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("Print Node");
        System.out.println("Child Count"+this.getChildeCount());
if(string!=null)
{
    System.out.println("printed value: "+string);
}
if(arguments!=null)
    arguments.accept(astVisitor);
        System.out.println("**********************************************");

    }
}
