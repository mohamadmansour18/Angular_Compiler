package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Equalty extends Node {
    private ArrayList<Relation> relations=new ArrayList<>();

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if(relations!=null)
        {
            for (Relation r:relations)
                r.accept(ast_Visitor);
        }
    }

    @Override
    public String getValue() {

            if (relations!=null)
                if(relations.getFirst()!=null)
                    return relations.getFirst().getValue();
            return " ";
    }

    public ArrayList<Relation> getRelations() {
        return relations;
    }

    public void setRelations(ArrayList<Relation> relations) {
        this.relations = relations;
    }
}
