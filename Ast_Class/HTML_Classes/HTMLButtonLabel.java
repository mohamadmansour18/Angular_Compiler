package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class HTMLButtonLabel extends Node implements HtmlSectionNode {

    private ArrayList<ButtonAttribute> attributes = new ArrayList<>();
    private ButtonContent content;

    public ArrayList<ButtonAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<ButtonAttribute> attributes) {
        this.attributes = attributes;
    }

    public ButtonContent getContent() {
        return content;
    }

    public void setContent(ButtonContent content) {
        this.content = content;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<button");
        for (ButtonAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(">");
        if (content != null) {
            sb.append(content.getValue());
        }
        sb.append("</button>");
        return sb.toString();
    }
}
