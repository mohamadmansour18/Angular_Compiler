package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class ComponentBody extends Node {

    private ArrayList<ComponentProperty> properties = new ArrayList<>();

    public ArrayList<ComponentProperty> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<ComponentProperty> properties) {
        this.properties = properties;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("@Component({\n");
        for (ComponentProperty prop : properties) {
            sb.append("  ").append(prop.getValue()).append(",\n");
        }
        sb.append("})");
        return sb.toString();
    }
}
