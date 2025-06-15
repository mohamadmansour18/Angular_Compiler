package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class AngularComponents extends Node implements Content {
    private String string;
    private ArrayList<Attribute> attributes=new ArrayList<>();

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

}
