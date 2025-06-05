package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Header extends Node {
    private Prameters prameters;
    private Type type;

    public Prameters getPrameters() {
        return prameters;
    }

    public void setPrameters(Prameters prameters) {
        this.prameters = prameters;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }

    StringBuilder s = new StringBuilder();
    String st="";
    @Override
    public String getValue() {
        if (type != null) {
            st=type.getValue();
        } else {
            st="any";
        }
        return st;
    }
}
