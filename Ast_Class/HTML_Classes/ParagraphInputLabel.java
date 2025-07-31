package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class ParagraphInputLabel extends Node implements ParagraphContentNode {

    // يمثل الخصائص الموجودة داخل <input> مثل type, placeholder, id, إلخ
    private ArrayList<InputAttribute> attributes = new ArrayList<>();

    public ArrayList<InputAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<InputAttribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<input");
        for (InputAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(" />");
        return sb.toString();
    }
}
