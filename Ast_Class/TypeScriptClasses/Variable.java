package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class Variable extends Info{
    private NumberStringBool numberStringBool;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if(numberStringBool!=null)
            numberStringBool.accept(ast_Visitor);
    }

    public NumberStringBool getNumberStringBool() {
        return numberStringBool;
    }

    public void setNumberStringBool(NumberStringBool numberStringBool) {
        this.numberStringBool = numberStringBool;
    }
}
