package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class TemplateStatement extends Node implements Stetment {
    private ArrayList<Element> elements = new ArrayList<>();
    private ArrayList<TextLable> textLable = new ArrayList<>();

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public ArrayList<TextLable> getTextLable() {
        return textLable;
    }

    public void setTextLable(ArrayList<TextLable> textLable) {
        this.textLable = textLable;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }
}
