package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class PrefixStatement extends Statment{
    private Prefix prefix;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        if(prefix != null){
            prefix.accept(astVisitor);
        }
    }
}
