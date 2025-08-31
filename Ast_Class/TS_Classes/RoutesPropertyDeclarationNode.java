package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class RoutesPropertyDeclarationNode extends Node {
    private String name;
    private String typeName;
    private Node initializer;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTypeName() { return typeName; }
    public void setTypeName(String typeName) { this.typeName = typeName; }

    public Node getInitializer() { return initializer; }
    public void setInitializer(Node initializer) { this.initializer = initializer; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (name != null) sb.append(name);
        sb.append(": ");
        if (typeName != null) sb.append(typeName);
        sb.append(" = ");
        if (initializer != null) sb.append(initializer.getValue());
        sb.append(";");
        return sb.toString();
    }
}
