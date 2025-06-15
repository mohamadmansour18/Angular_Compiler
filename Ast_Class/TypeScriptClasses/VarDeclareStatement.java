package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class VarDeclareStatement extends Node implements Stetment {
    private Keyword key;
    private Prameter prameter;

    public Keyword getKey() {
        return key;
    }

    public void setKey(Keyword key) {
        this.key = key;
    }

    public Prameter getPrameter() {
        return prameter;
    }

    public void setPrameter(Prameter prameter) {
        this.prameter = prameter;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
