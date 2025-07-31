package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class HTMLFormLabel extends Node implements HtmlSectionNode {

    private ArrayList<FormAttribute> attributes = new ArrayList<>();
    private ArrayList<FormContentNode> content = new ArrayList<>();

    public ArrayList<FormAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<FormAttribute> attributes) {
        this.attributes = attributes;
    }

    public ArrayList<FormContentNode> getContent() {
        return content;
    }

    public void setContent(ArrayList<FormContentNode> content) {
        this.content = content;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<form");
        for (FormAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(">\n");
        for (FormContentNode node : content) {
            sb.append("  ").append(node.getValue()).append("\n");
        }
        sb.append("</form>");
        return sb.toString();
    }
}
