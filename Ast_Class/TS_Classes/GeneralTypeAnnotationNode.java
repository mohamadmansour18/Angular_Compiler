package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class GeneralTypeAnnotationNode extends Node {
    private Node typeRef;

    public Node getTypeRef() {
        return typeRef;
    }

    public void setTypeRef(Node typeRef) {
        this.typeRef = typeRef;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return (typeRef != null) ? typeRef.getValue() : "";
    }

    @Override
    public String generate(GenContext ctx) {
        return " ";
    }
}
