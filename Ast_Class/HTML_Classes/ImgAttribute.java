package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class ImgAttribute extends Node {

    // يمثل نوع الخاصية مثل src, alt, style
    private String attributeType;

    // يمثل القيمة النصية للخاصية
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

    public String generate(GenContext ctx) {

        String name = (attributeType != null) ? attributeType.trim() : "";
        if (name.isEmpty()) return "";

        if ("src".equalsIgnoreCase(name)) {
            name = "[src]";
        }

        String val = (value != null) ? value : "";
        val = val.replace("\"", "&quot;");

        return name + "=\"" + val + "\"";
    }
}
