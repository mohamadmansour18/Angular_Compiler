package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class For extends Node {
    private String afor;
    private LoopInit loopInit;
    private Expression expression;
    private LoopStep loopStep;
    private ArrayList<Statements> statements=new ArrayList<>();

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if (afor!=null)
            System.out.println(afor);
        if(loopInit!=null)
        {
            loopInit.accept(ast_Visitor);
        }
        if(expression!=null)
            expression.accept(ast_Visitor);
        if(loopStep!=null)
        {
            loopStep.accept(ast_Visitor);
        }
        if(statements!=null)
        {
            for (Statements s:statements)
                s.accept(ast_Visitor);
        }
    }

    public String getAfor() {
        return afor;
    }

    public void setAfor(String afor) {
        this.afor = afor;
    }

    public LoopInit getLoopInit() {
        return loopInit;
    }

    public void setLoopInit(LoopInit loopInit) {
        this.loopInit = loopInit;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public LoopStep getLoopStep() {
        return loopStep;
    }

    public void setLoopStep(LoopStep loopStep) {
        this.loopStep = loopStep;
    }

    public ArrayList<Statements> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statements> statements) {
        this.statements = statements;
    }
}
