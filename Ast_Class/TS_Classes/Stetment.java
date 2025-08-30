package Ast_Class.TS_Classes;

import Visitor.AST_Visitor;

public interface Stetment {
    void accept(AST_Visitor visitor);
    String getValue();
}
