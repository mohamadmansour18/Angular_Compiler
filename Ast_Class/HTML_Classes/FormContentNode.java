package Ast_Class.HTML_Classes;

import Visitor.AST_Visitor;

public interface FormContentNode {
    void accept(AST_Visitor visitor);
    String getValue();
}
