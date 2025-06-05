package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class PrefixStatement extends Statment{
    private Prefix  prefix;

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }


    public Prefix getPrefix() {
        return prefix;
    }


    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }
}
