package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Templet extends Node {
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
        if (elements!=null)
        {
            for (Element e :elements)
                e.accept(ast_Visitor);
        }
        if (texts!=null)
        {
            for (Text t:texts)
                t.accept(ast_Visitor);
        }
    }
}
