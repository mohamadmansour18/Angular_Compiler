package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ObjectProperty extends Node {

    private String key;
    private ExpressionNode value;

    public ObjectProperty(String key, ExpressionNode value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public ExpressionNode getValueExpression() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
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
        return key + ": " + value.getValue();
    }

}
