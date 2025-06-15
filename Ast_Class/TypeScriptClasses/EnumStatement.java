package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class EnumStatement extends Node implements Stetment {
    private String name;
    private EnumAssignable enumAssignable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumAssignable getEnumAssignable() {
        return enumAssignable;
    }

    public void setEnumAssignable(EnumAssignable enumAssignable) {
        this.enumAssignable = enumAssignable;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
