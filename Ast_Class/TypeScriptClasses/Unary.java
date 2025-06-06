package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Unary extends Node {
    private Unary unary;
    private PrimaryExpression primaryExpression;

    public Unary getUnary() {
        return unary;
    }

    public void setUnary(Unary unary) {
        this.unary = unary;
    }

    public PrimaryExpression getPrimaryExpression() {
        return primaryExpression;
    }

    public void setPrimaryExpression(PrimaryExpression primaryExpression) {
        this.primaryExpression = primaryExpression;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    @Override
    public String getValue() {
        if (primaryExpression!=null) {
            return primaryExpression.getValue();
        }
        return " ";
    }
}
