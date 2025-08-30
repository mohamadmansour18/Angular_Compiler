package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class HTMLAnchorLabel extends Node implements HtmlSectionNode{
    private ArrayList<AnchorAttribute> attributes = new ArrayList<>();
    private AnchorContent content;

    public ArrayList<AnchorAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<AnchorAttribute> attributes) {
        this.attributes = attributes;
    }

    public AnchorContent getContent() {
        return content;
    }

    public void setContent(AnchorContent content) {
        this.content = content;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<a");
        for (AnchorAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(">");
        if (content != null) {
            sb.append(content.getValue());
        }
        sb.append("</a>");
        return sb.toString();
    }
}
