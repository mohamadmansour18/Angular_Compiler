package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class CullFunction extends Node {
    private String name;
    private Arguments arguments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }

    StringBuilder s = new StringBuilder();
    String st="";
    String st1="";
    @Override
    public String getValue() {
        if(name!=null)
        {
            st=name;
        }
        if(arguments!=null)
        {
            st1="("+arguments.getValue()+")";
        }
        return st+st1;
    }
}
