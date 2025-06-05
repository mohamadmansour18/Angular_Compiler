package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ElementContent extends Node {
    private ArrayList<Content> contents = new ArrayList<>();

    public ArrayList<Content> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Content> contents) {
        this.contents = contents;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    StringBuilder s=new StringBuilder();

    @Override
    public String getValue() {
        s.append("");
        if (contents != null)
        {
            for (Content c:contents){
               s.append( c.getValue());
            }
        }
        return s.toString();
    }
}
