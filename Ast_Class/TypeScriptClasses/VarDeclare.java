package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class VarDeclare extends Node {
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
        System.out.println("**********************************************");
        System.out.println("VarDeclare Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (key != null) {
           key.accept(astVisitor);
        }
        if (prameter != null) {
            System.out.println("var name");
            prameter.accept(astVisitor);
        }
        System.out.println("**********************************************");

    }
}
