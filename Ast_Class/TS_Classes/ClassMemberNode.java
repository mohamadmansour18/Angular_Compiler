package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
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

    @Override
    public String generate(GenContext ctx) {
        if (member == null) return "";

        String code = member.generate(ctx);
        if (code == null) return "";

        return code.trim();
    }
}
