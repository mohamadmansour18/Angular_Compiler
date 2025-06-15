package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public interface Info {
    void accept(AST_Visitor visitor);
}
