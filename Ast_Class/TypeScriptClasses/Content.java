package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public interface Content {
    void accept(AST_Visitor visitor);
}
