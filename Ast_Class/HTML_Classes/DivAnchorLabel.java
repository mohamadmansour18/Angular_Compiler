package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class DivAnchorLabel extends Node implements HtmlSectionNode{
    private HTMLAnchorLabel anchor;

    public HTMLAnchorLabel getAnchor() {
        return anchor;
    }

    public void setAnchor(HTMLAnchorLabel anchor) {
        this.anchor = anchor;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return (anchor != null) ? anchor.getValue() : "";
    }
}
