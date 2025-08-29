package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class DivLabel extends Node implements HtmlSectionNode{
    private HTMLLabel label;

    public HTMLLabel getLabel() {
        return label;
    }

    public void setLabel(HTMLLabel label) {
        this.label = label;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return (label != null) ? label.getValue() : "";
    }
}
