package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class Dirictive extends Content {
    private DirictiveElement dirictiveElement;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    public DirictiveElement getDirictiveElement() {
        return dirictiveElement;
    }

    @Override
    public String getValue() {
        if (dirictiveElement!=null)
           return dirictiveElement.getValue();
    return "";}

    public void setDirictiveElement(DirictiveElement dirictiveElement) {
        this.dirictiveElement = dirictiveElement;
    }
}
