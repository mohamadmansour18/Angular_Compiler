package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class Structural extends DirictiveElement{
    private StructuralDirective structural;

    public StructuralDirective getStructuralDirective() {
        return structural;
    }

    public void setStructural(StructuralDirective structural) {
        this.structural = structural;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if (structural!=null)
        {
            structural.accept(ast_Visitor);
        }
    }



}
