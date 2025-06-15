package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Structural extends Node implements DirectiveElement {
    private String string;
    private Expression expression;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

}
