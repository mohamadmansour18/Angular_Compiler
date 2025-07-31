package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class LiteralExpressionLabel extends Node implements ExpressionNode{

    private String value;  // القيمة مثل: "Hello", 42, true

    public String getValueText() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return value;
    }

}
