package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class InterfaceBody extends Node {

    private ArrayList<InterfaceProperty> properties;

    public InterfaceBody(ArrayList<InterfaceProperty> properties) {
        this.properties = properties;
    }

    public ArrayList<InterfaceProperty> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<InterfaceProperty> properties) {
        this.properties = properties;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (InterfaceProperty prop : properties) {
            sb.append("  ").append(prop.getValue()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
