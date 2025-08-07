package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ParagraphTextLabel extends Node implements ParagraphContentNode {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

}
