package Ast_Class.HTML_Classes;

import Visitor.AST_Visitor;

public interface DivContentNode {
    String getValue();
    void accept(AST_Visitor visitor);
}
