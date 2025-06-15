package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public interface Stetment  {
    void accept(AST_Visitor visitor);
}
