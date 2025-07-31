package Ast_Class.HTML_Classes;

import Visitor.AST_Visitor;

public class DivNestedLabel extends HTMLDivLabel implements DivContentNode {

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }
}
