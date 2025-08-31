package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
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

    @Override
    public String generate(GenContext ctx) {

        if (content == null || content.isEmpty()) return "";

        String s = content;

        s = s.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");

        return s;
    }
}
