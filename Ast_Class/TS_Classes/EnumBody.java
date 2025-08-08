package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class EnumBody extends Node {

    private ArrayList<EnumMember> members;

    public ArrayList<EnumMember> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<EnumMember> members) {
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
        for (int i = 0; i < members.size(); i++) {
            sb.append("  ").append(members.get(i).getValue());
            if (i < members.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
