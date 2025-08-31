package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
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

    @Override
    public String generate(GenContext ctx) {
        if (label == null) return "";
        String out = label.generate(ctx);
        return (out != null) ? out : "";
    }
}
