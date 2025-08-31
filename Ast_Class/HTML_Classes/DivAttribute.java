package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class DivAttribute extends Node {

    // يمثل نوع الخاصية مثل class أو id أو style أو ngIf...
    private String attributeType;

    // يمثل القيمة النصية للخاصية
    private String value;

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    public void setAttributeValue(String value) {
        this.value = value;
    }

    public String getAttributeValue()
    {
        return value ;
    }

    public String getValue() {
        return attributeType + "=\"" + value + "\"";
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String generate(GenContext ctx) {

        String name = (attributeType != null) ? attributeType : "";

        String val = (value != null) ? value : "";
        val = val.replace("\"", "&quot;"); // احتياط حتى لا تكسر HTML attribute

        if (name.isEmpty()) return "";
        return name + "=\"" + val + "\"";
    }
}
