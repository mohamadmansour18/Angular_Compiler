package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Prop extends Node {
    private ArrayList<BaseExpression> baseExpression = new ArrayList<>();
    private ArrayList<Expression> expressions = new ArrayList<>();

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if (baseExpression != null)
            for (BaseExpression b : baseExpression)
                b.accept(ast_Visitor);
        if (expressions != null) {
            for (Expression e : expressions)
                e.accept(ast_Visitor);
        }
    }

    public ArrayList<BaseExpression> getBaseExpression() {
        return baseExpression;
    }

    public void setBaseExpression(ArrayList<BaseExpression> baseExpression) {
        this.baseExpression = baseExpression;
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }
}
