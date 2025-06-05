package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class AttributeLable extends DirictiveElement {
    private AttributeDirictive attributeLable;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    @Override
    public String getValue() {
        if (attributeLable!=null) {
            return attributeLable.getValue();
        }
    return "";}

    public AttributeDirictive getAttributeLable() {
        return attributeLable;
    }

    public void setAttributeLable(AttributeDirictive attributeLable) {
        this.attributeLable = attributeLable;
    }
}
