package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class InjectableProperty extends Node {
    private String key; // PROVIDEDIN | USECLASS | USEVALUE
    private String stringValue; // لقيم مثل providedIn: "root" أو useClass: ServiceX
    private ExpressionNode expressionValue; // لقيم مثل useValue: 42 أو object literal

    public void setKey(String key) {
        this.key = key;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setExpressionValue(ExpressionNode expressionValue) {
        this.expressionValue = expressionValue;
    }

    public InjectableProperty(String key, String stringValue) {
        this.key = key;
        this.stringValue = stringValue;
    }

    public InjectableProperty(String key, ExpressionNode expressionValue) {
        this.key = key;
        this.expressionValue = expressionValue;
    }

    public String getKey() {
        return key;
    }

    public String getStringValue() {
        return stringValue;
    }

    public ExpressionNode getExpressionValue() {
        return expressionValue;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        if (expressionValue != null) {
            return key.toLowerCase() + ": " + expressionValue.getValue();
        } else {
            return key.toLowerCase() + ": \"" + stringValue + "\"";
        }
    }
}
