package Ast_Class.HTML_Classes;

import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class DivNestedLabel extends HTMLDivLabel implements DivContentNode {

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String generate(GenContext ctx) {
        return super.generate(ctx);
    }
}
