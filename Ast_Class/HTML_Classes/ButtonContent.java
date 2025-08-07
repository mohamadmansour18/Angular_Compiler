package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ButtonContent extends Node {

    // يمثل النص الموجود داخل الزر
    private String content;

    public String getRawContent() {
        return content;
    }

    public void setRawContent(String content) {
        this.content = content;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

}
