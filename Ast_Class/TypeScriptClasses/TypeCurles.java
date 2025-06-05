package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class TypeCurles extends Node {
    private ArrayList<TypeCurle> typeCurles=new ArrayList<>();

    public ArrayList<TypeCurle> getTypeCurles() {
        return typeCurles;
    }

    public void setTypeCurles(ArrayList<TypeCurle> typeCurles) {
        this.typeCurles = typeCurles;
    }

public void accept(AST_Visitor astVisitor){
        astVisitor.visit(this);
    System.out.println("**********************************************");
    System.out.println("TypeCurles Node");
    System.out.println("Child Count"+this.getChildeCount());
if (typeCurles!=null)
{
    for (TypeCurle t:typeCurles)
    {
        t.accept(astVisitor);
    }
}
    System.out.println("**********************************************");

}}
