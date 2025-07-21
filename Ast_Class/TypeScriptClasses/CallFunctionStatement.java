package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class CallFunctionStatement extends Node implements Stetment {
    private String ID;
    private Arguments arguments;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }

    StringBuilder s = new StringBuilder();
    String st="";
    String st1="";
    @Override
    public String getValue() {
        if(ID!=null)
        {
            st=ID;
        }
        if(arguments!=null)
        {
            st1="("+arguments.getValue()+")";
        }
        return st+st1;
    }
}
