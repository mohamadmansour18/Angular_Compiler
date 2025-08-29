package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class SpanAttribute extends Node {

    private String attributeType;
    private String value;

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
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
        return attributeType + "=\"" + value + "\"";
    }
}
