package Ast_Class.TS_Classes;

import Visitor.AST_Visitor;

public interface TsSectionNode {
    String getValue();
    void accept(AST_Visitor visitor);
}
