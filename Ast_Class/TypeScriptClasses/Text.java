package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Text extends Node {
    private ArrayList<String> strings=new ArrayList<>();
    private ArrayList<Inter> inters=new ArrayList<>();

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if (strings!=null)
            for (String s:strings)
                System.out.println(s);
        if(inters!=null)
            for (Inter i:inters)
                i.accept(ast_Visitor);
    }

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    public ArrayList<Inter> getInters() {
        return inters;
    }

    public void setInters(ArrayList<Inter> inters) {
        this.inters = inters;
    }
}
