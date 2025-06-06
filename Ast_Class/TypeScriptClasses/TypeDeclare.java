package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TypeDeclare extends Node {
    private String nmae;
    private TypeEqual typeEqual;

    public String getNmae() {
        return nmae;
    }

    public void setNmae(String nmae) {
        this.nmae = nmae;
    }

    public TypeEqual getTypeEqual() {
        return typeEqual;
    }

    public void setTypeEqual(TypeEqual typeEqual) {
        this.typeEqual = typeEqual;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
