package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ClassMemberNode extends Node {
    // عضو واحد فقط من البدائل: constructorDeclaration | functionDeclaration | propertyDeclaration | exprStatement
    private Node member;

    public Node getMember() {
        return member;
    }

    public void setMember(Node member) {
        this.member = member;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return (member != null) ? member.getValue() : "";
    }
}
