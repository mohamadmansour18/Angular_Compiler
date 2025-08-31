package Ast_Class.HTML_Classes;

import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public interface ParagraphContentNode {
    void accept(AST_Visitor visitor);
    String getValue();
    String generate(GenContext ctx);
}
