package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class Towway extends DirictiveElement {
private TowwayDirective towwayDirective;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if (towwayDirective!=null)
            towwayDirective.accept(ast_Visitor);
    }

    public TowwayDirective getTowwayDirective() {
        return towwayDirective;
    }

    public void setTowwayDirective(TowwayDirective towwayDirective) {
        this.towwayDirective = towwayDirective;
    }
}
