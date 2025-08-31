package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class DivSpanLabel extends Node implements HtmlSectionNode{
    private HTMLSpanLabel span;

    public HTMLSpanLabel getSpan() {
        return span;
    }

    public void setSpan(HTMLSpanLabel span) {
        this.span = span;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return (span != null) ? span.getValue() : "";
    }

    @Override
    public String generate(GenContext ctx) {
        if (span == null) return "";
        String out = span.generate(ctx);
        return (out != null) ? out : "";
    }

}

