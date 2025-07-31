package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class EnumMember extends Node {
    private String name;
    private ExpressionNode value; // optional

    public EnumMember(String name, ExpressionNode value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public ExpressionNode getValueExpression() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(ExpressionNode value) {
        this.value = value;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        if (value != null) {
            return name + " = " + value.getValue();
        } else {
            return name;
        }
    }
}
