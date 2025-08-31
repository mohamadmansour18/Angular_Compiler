package Ast_Class.HTML_Classes;

import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public interface HtmlSectionNode {
    String getValue();
    void accept(AST_Visitor visitor);
    String generate(GenContext ctx);
}
