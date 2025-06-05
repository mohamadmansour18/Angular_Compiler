package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class TagOpenEmpty extends Node {
    private String id;
    private ElementContent elementContent;
    private ArrayList<Attribute> attributes=new ArrayList<>();

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if(id!=null)
            System.out.println(id);
        if(elementContent!=null)
            elementContent.accept(ast_Visitor);
        if(attributes!=null)
        {
            for (Attribute a:attributes)
                a.accept(ast_Visitor);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ElementContent getElementContent() {
        return elementContent;
    }

    public void setElementContent(ElementContent elementContent) {
        this.elementContent = elementContent;
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<Attribute> attributes) {
        this.attributes = attributes;
    }
}
