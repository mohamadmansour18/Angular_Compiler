package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class EnumStatement extends Statment{
    private Enum anEnum;

    public Enum getAnEnum() {
        return anEnum;
    }

    public void setAnEnum(Enum anEnum) {
        this.anEnum = anEnum;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
