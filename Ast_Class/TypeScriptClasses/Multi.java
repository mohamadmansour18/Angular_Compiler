package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Multi extends Node {
    private ArrayList<Unary> unaries=new ArrayList<>();

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if (unaries!=null)
        {
            for (Unary u:unaries)
                u.accept(ast_Visitor);
        }
    }

    @Override
    public String getValue() {

            if (unaries!=null)
                if(unaries.getFirst()!=null)
                    return unaries.getFirst().getValue();
   return " ";
    }

    public ArrayList<Unary> getUnaries() {
        return unaries;
    }

    public void setUnaries(ArrayList<Unary> unaries) {
        this.unaries = unaries;
    }
}
