package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public interface DirectiveElement {
    void accept(AST_Visitor visitor);
}
