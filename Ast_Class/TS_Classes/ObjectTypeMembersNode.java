package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ObjectTypeMembersNode extends Node {
    private ArrayList<Node> members = new ArrayList<>();

    public ArrayList<Node> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Node> members) {
        this.members = members;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < members.size(); i++) {
            Node m = members.get(i);
            sb.append(m.getValue()).append(";");
            if (i < members.size() - 1) sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        return " ";
    }
}
