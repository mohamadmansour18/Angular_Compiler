package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class LabelContent extends Node {

    private String text;
    private HTMLSpanLabel span;
    private HTMLInputLabel input;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public HTMLSpanLabel getSpan() {
        return span;
    }

    public void setSpan(HTMLSpanLabel span) {
        this.span = span;
    }

    public HTMLInputLabel getInput() {
        return input;
    }

    public void setInput(HTMLInputLabel input) {
        this.input = input;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        if (text != null) {
            return text;
        } else if (span != null) {
            return span.getValue();
        } else if (input != null) {
            return input.getValue();
        }
        return "";
    }

    @Override
    public String generate(GenContext ctx) {
        if (text != null) {
            String s = text;
            s = s.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;");
            return s;
        }

        // 2) <span> داخلي
        if (span != null) {
            String out = span.generate(ctx);
            return (out != null) ? out : "";
        }

        // 3) <input> داخلي
        if (input != null) {
            String out = input.generate(ctx);
            return (out != null) ? out : "";
        }

        return "";
    }
}
