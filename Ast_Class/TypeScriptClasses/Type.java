package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Type extends Node {
    private ArrayList<Types> types = new ArrayList<>();

    public ArrayList<Types> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Types> types) {
        this.types = types;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }

    StringBuilder s=new StringBuilder();
    @Override
    public String getValue() {
        if(types!=null)
        {
            for (Types t:types) {
                s.append(t.getValue());
            }
        }
        return s.toString();
    }
}
