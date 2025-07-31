package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class IdentifierExpressionLabel extends Node implements ExpressionNode{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }
}
