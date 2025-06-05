package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class FunctionCall extends Node {
    private String id;
    private BaseExpression baseExpression;
    private ArrayList<Expression> expressions;

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }

    public BaseExpression getBaseExpression() {
        return baseExpression;
    }

    public void setBaseExpression(BaseExpression baseExpression) {
        this.baseExpression = baseExpression;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }


}
