package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class TypeDeclareStatement extends Statment{
    private TypeDeclare type;

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        if(type!=null)
            type.accept(astVisitor);
    }

    public TypeDeclare getType() {
        return type;
    }

    public void setType(TypeDeclare type) {
        this.type = type;
    }
}
