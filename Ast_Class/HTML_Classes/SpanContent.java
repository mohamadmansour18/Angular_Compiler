package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class SpanContent extends Node {
    private String value;

    public String getValueRaw() {
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

    @Override
    public String generate(GenContext ctx) {

        if (value == null || value.isEmpty()) return "";

        String s = value;
        s = s.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");

        return s;
    }
}
