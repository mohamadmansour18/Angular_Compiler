package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class LoopStatement extends Statment{
    private LoopStatments loopStatments;

    public LoopStatments getLoopStatments() {
        return loopStatments;
    }

    public void setLoopStatments(LoopStatments loopStatments) {
        this.loopStatments = loopStatments;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
