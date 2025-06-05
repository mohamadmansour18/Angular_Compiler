package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class LogicAnd extends Node {
    private ArrayList<Equalty> equalties = new ArrayList<>();

    public ArrayList<Equalty> getEqualties() {
        return equalties;
    }

    public void setEqualties(ArrayList<Equalty> equalties) {
        this.equalties = equalties;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    @Override
    public String getValue() {

            if (equalties!=null)
                if(equalties.getFirst()!=null)
                    return equalties.getFirst().getValue();

   return " "; }


}
