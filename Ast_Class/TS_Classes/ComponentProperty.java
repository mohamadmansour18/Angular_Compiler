package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ComponentProperty extends Node {

    private String key;
    private String stringValue;             // إذا كانت القيمة عبارة عن STRING
    private ArrayLiteral arrayLiteralValue; // إذا كانت القيمة عبارة عن Array

    public String getKey() {
        return key;
    }

    public String getStringValue() {
        return stringValue;
    }

    public ArrayLiteral getArrayLiteralValue() {
        return arrayLiteralValue;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setArrayLiteralValue(ArrayLiteral arrayLiteralValue) {
        this.arrayLiteralValue = arrayLiteralValue;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        if (stringValue != null) {
            return key + ": \"" + stringValue + "\"";
        } else if (arrayLiteralValue != null) {
            return key + ": " + arrayLiteralValue.getValue();
        } else {
            return key + ": null";
        }
    }
}
