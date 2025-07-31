package Ast_Class.TS_Classes;

import Visitor.AST_Visitor;

public interface ClassMemberNode {
    String getValue();
    void accept(AST_Visitor visitor);
}
