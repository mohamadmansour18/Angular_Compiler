package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class HTMLLabel extends Node implements HtmlSectionNode {

    private ArrayList<LabelAttribute> attributes = new ArrayList<>();
    private ArrayList<LabelContent> contents = new ArrayList<>();

    public ArrayList<LabelAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<LabelAttribute> attributes) {
        this.attributes = attributes;
    }

    public ArrayList<LabelContent> getContents() {
        return contents;
    }

    public void setContents(ArrayList<LabelContent> contents) {
        this.contents = contents;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<label");
        for (LabelAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(">");
        for (LabelContent c : contents) {
            if (c != null) {
                sb.append(c.getValue());
            }
        }
        sb.append("</label>");
        return sb.toString();
    }
}
