package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class EnumAssin extends Node {
    private String name;
    private NumberStringBool numberStringBool;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NumberStringBool getNumberStringBool() {
        return numberStringBool;
    }

    public void setNumberStringBool(NumberStringBool numberStringBool) {
        this.numberStringBool = numberStringBool;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
