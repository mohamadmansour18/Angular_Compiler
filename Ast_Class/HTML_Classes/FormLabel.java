package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class FormLabel extends Node implements FormContentNode {

    private ArrayList<LabelAttribute> attributes = new ArrayList<>();
    private LabelContent content;

    public ArrayList<LabelAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<LabelAttribute> attributes) {
        this.attributes = attributes;
    }

    public LabelContent getContent() {
        return content;
    }

    public void setContent(LabelContent content) {
        this.content = content;
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
        if (content != null) {
            sb.append(content.getValue());
        }
        sb.append("</label>");
        return sb.toString();
    }
}
