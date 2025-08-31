package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ObjectLiteralNode extends Node {
    private ArrayList<ObjectPropertyNode> properties = new ArrayList<>();

    public ArrayList<ObjectPropertyNode> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<ObjectPropertyNode> properties) {
        this.properties = properties;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < properties.size(); i++) {
            sb.append(properties.get(i).getValue());
            if (i < properties.size() - 1) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }
}
