package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class HTMLDivLabel extends Node implements HtmlSectionNode {

    private ArrayList<DivAttribute> attributes = new ArrayList<>();

    private ArrayList<DivContentNode> content = new ArrayList<>();

    public ArrayList<DivAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<DivAttribute> attributes) {
        this.attributes = attributes;
    }

    public ArrayList<DivContentNode> getContent() {
        return content;
    }

    public void setContent(ArrayList<DivContentNode> content) {
        this.content = content;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div");

        for (DivAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }

        sb.append(">\n");

        for (DivContentNode child : content) {
            sb.append("  ").append(child.getValue()).append("\n");
        }

        sb.append("</div>");
        return sb.toString();
    }
}