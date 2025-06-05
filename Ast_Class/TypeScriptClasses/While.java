package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class While extends Node {
    private String awhile;
    private Expression expression;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if(awhile!=null)
            System.out.println(awhile);
        if (expression!=null)
        {
            expression.accept(ast_Visitor);
        }
    }

    public String getAwhile() {
        return awhile;
    }

    public void setAwhile(String awhile) {
        this.awhile = awhile;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
