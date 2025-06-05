package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class If_statment extends Node {
    private Expression expression =new Expression();
    private ArrayList<Statements> statements=new ArrayList<>();

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public ArrayList<Statements> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statements> statements) {
        this.statements = statements;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if(expression!=null)
            expression.accept(ast_Visitor);
        if (statements!=null)
        {
            for (Statements s:statements)
                s.accept(ast_Visitor);
        }
    }
}
