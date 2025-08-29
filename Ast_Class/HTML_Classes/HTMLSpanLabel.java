package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class HTMLSpanLabel extends Node implements HtmlSectionNode{
    private ArrayList<SpanAttribute> attributes = new ArrayList<>();
    private SpanContent content;

    public ArrayList<SpanAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<SpanAttribute> attributes) {
        this.attributes = attributes;
    }

    public SpanContent getContent() {
        return content;
    }

    public void setContent(SpanContent content) {
        this.content = content;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<span");
        for (SpanAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(">");
        if (content != null) {
            sb.append(content.getValue());
        }
        sb.append("</span>");
        return sb.toString();
    }
}
