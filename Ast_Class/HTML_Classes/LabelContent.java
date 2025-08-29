package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
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
}
