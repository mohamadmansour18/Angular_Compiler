package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class ClassBlock extends Node {

    private ArrayList<ClassMemberNode> members = new ArrayList<>();

    public ArrayList<ClassMemberNode> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<ClassMemberNode> members) {
        this.members = members;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (ClassMemberNode member : members) {
            sb.append("  ").append(member instanceof Node ? ((Node) member).getValue() : member.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
