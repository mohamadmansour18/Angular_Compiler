package Visitor;


import Ast_Class.HTML_Classes.*;
import Ast_Class.TS_Classes.*;

public interface AST_Visitor {
    void visit(RootProgram root);
    void visit(HTMLDivLabel div);
    void visit(DivAttribute attribute);
}
