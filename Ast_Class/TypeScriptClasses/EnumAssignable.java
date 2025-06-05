package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class EnumAssignable extends Node {
    private ArrayList<EnumAssin> enumAssins = new ArrayList<>();

    public ArrayList<EnumAssin> getEnumAssins() {
        return enumAssins;
    }

    public void setEnumAssins(ArrayList<EnumAssin> enumAssins) {
        this.enumAssins = enumAssins;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
