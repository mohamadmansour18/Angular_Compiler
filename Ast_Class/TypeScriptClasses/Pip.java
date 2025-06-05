package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Pip extends Node {
    private BaseExpression baseExpression;
    private ArrayList<Expression> expressions;

    public BaseExpression getBaseExpression() {
        return baseExpression;
    }

    public void setBaseExpression(BaseExpression baseExpression) {
        this.baseExpression = baseExpression;
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }
}
