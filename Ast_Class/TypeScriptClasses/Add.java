package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Add extends Node {
    private ArrayList<Multi> multis=new ArrayList<>();

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    @Override
    public String getValue() {

            if (multis!=null)
                if(multis.getFirst()!=null)
                    return multis.getFirst().getValue();
            return " ";
    }

    public ArrayList<Multi> getMultis() {
        return multis;
    }

    public void setMultis(ArrayList<Multi> multis) {
        this.multis = multis;
    }
}
