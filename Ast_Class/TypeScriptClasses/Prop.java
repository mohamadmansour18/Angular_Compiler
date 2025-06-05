package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Prop extends Node {
    private ArrayList<BaseExpression> baseExpression = new ArrayList<>();
    private ArrayList<Expression> expressions = new ArrayList<>();

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

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }
}
