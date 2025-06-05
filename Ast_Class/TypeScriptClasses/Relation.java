package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Relation extends Node {
    private ArrayList<Add> adds=new ArrayList<>();

    public ArrayList<Add> getAdds() {
        return adds;
    }

    public void setAdds(ArrayList<Add> adds) {
        this.adds = adds;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    @Override
    public String getValue() {
        if (adds!=null) {
            if (adds.getFirst() != null) {
                return adds.getFirst().getValue();
            }
        }
        return " ";
    }


}
