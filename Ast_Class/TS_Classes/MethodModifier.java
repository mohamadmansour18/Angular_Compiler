package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class MethodModifier extends Node {

    private String modifier;

    public MethodModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

}
