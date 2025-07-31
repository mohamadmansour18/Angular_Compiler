package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class HTMLImageLabel extends Node implements HtmlSectionNode {

    private ArrayList<ImgAttribute> attributes = new ArrayList<>();

    public ArrayList<ImgAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<ImgAttribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<img");
        for (ImgAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(" />");
        return sb.toString();
    }
}
