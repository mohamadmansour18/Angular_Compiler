package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

import java.util.ArrayList;

public class AngularTemplet extends Info {
    private ArrayList<Element> elements=new ArrayList<>();
    private ArrayList<Text>texts=new ArrayList<>();

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public ArrayList<Text> getTexts() {
        return texts;
    }

    public void setTexts(ArrayList<Text> texts) {
        this.texts = texts;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }
}
