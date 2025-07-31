package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class SelectExpressionLabel extends Node implements ExpressionNode{

    private SelectorCall selectorCall;

    public SelectorCall getSelectorCall() {
        return selectorCall;
    }

    public void setSelectorCall(SelectorCall selectorCall) {
        this.selectorCall = selectorCall;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "this.store.select(" + selectorCall.getValue() + ")";
    }

}
