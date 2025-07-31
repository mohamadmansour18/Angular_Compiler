package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ButtonAttribute extends Node {

    // يمثل نوع الخاصية مثل type, click, style, disabled...
    private String attributeType;

    // يمثل القيمة النصية للخاصية (قد تكون null مثل disabled)
    private String value;

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    public String getAttributeValue() {
        return value;
    }

    public void setAttributeValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return attributeType + "=\"" + value + "\"";
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }
}
