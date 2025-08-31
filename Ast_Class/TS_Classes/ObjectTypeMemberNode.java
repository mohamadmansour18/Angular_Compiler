package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ObjectTypeMemberNode extends Node {
    private String name;      // IDENTIFIER
    private boolean optional; // وجود QUESTION ?
    private Node typeRef;     // من قاعدة typeRef

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isOptional() { return optional; }
    public void setOptional(boolean optional) { this.optional = optional; }

    public Node getTypeRef() { return typeRef; }
    public void setTypeRef(Node typeRef) { this.typeRef = typeRef; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (name != null) sb.append(name);
        if (optional) sb.append("?");
        sb.append(": ");
        if (typeRef != null) sb.append(typeRef.getValue());
        return sb.toString();
    }
}
