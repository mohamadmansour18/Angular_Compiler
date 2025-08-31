package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class ObjectTypeNode extends Node {
    private Node members; // متوقع لاحقًا: ObjectTypeMembersNode

    public Node getMembers() {
        return members;
    }

    public void setMembers(Node members) {
        this.members = members;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (members != null) {
            String inner = members.getValue();
            if (inner != null && !inner.isEmpty()) {
                sb.append("\n  ")
                        .append(inner.replace("\n", "\n  "))
                        .append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        return " ";
    }
}
