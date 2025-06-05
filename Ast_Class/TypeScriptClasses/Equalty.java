package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Equalty extends Node {
    private ArrayList<Relation> relations = new ArrayList<>();

    public ArrayList<Relation> getRelations() {
        return relations;
    }

    public void setRelations(ArrayList<Relation> relations) {
        this.relations = relations;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    @Override
    public String getValue() {

            if (relations!=null)
                if(relations.getFirst()!=null)
                    return relations.getFirst().getValue();
            return " ";
    }


}
