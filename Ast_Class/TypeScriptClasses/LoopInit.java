package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class LoopInit extends Node {
    private VarDeclareStatement varDeclareStatement;
    private ArrayList<Expression> expressions=new ArrayList<>();

    public VarDeclareStatement getVarDeclareStatement() {
        return varDeclareStatement;
    }

    public void setVarDeclareStatement(VarDeclareStatement varDeclareStatement) {
        this.varDeclareStatement = varDeclareStatement;
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
