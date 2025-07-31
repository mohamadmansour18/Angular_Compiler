package Ast_Class.HTML_Classes;

import Visitor.AST_Visitor;

/**
 * يمثل <div> داخل <form>
 */
public class FormDivLabel extends HTMLDivLabel implements FormContentNode {

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }
}
