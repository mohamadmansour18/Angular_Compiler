package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class AnchorAttribute extends Node {
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

    @Override
    public String generate(GenContext ctx) {

        String name = (attributeType != null) ? attributeType.trim() : "";
        if (name.isEmpty()) return "";

        String val = (value != null) ? value.replace("\"", "&quot;") : "";
        return name + "=\"" + val + "\"";
    }
}
