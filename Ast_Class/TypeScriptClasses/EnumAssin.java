package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class EnumAssin extends Node {
    private String name;
    private Variable variable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
