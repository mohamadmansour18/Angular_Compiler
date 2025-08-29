package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class AnchorContent extends Node {
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
}
