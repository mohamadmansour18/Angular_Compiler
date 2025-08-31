package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class PropertyDeclarationNode extends Node {
    private Node property; // routesPropertyDeclaration | normalPropertyDeclaration

    public Node getProperty() {
        return property;
    }

    public void setProperty(Node property) {
        this.property = property;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return (property != null) ? property.getValue() : "";
    }

    public String generate(GenContext ctx) {
        if (property == null) return "";
        return property.generate(ctx);
    }
}
