package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class SelectorCall extends Node {

    private String selectorName;

    public String getSelectorName() {
        return selectorName;
    }

    public void setSelectorName(String selectorName) {
        this.selectorName = selectorName;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }
}
