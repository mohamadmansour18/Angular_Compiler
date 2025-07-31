package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class HTMLParagraphLabel extends Node implements HtmlSectionNode {

    private ArrayList<ParagraphAttribute> attributes = new ArrayList<>();
    private ParagraphContentNode content;

    public ArrayList<ParagraphAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<ParagraphAttribute> attributes) {
        this.attributes = attributes;
    }

    public ParagraphContentNode getContent() {
        return content;
    }

    public void setContent(ParagraphContentNode content) {
        this.content = content;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p");
        for (ParagraphAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(">");
        if (content != null) {
            sb.append(content.getValue());
        }
        sb.append("</p>");
        return sb.toString();
    }
}
