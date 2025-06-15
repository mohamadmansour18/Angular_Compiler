package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Characters extends Node implements Content {
    private Char aChar;

    public Char getaChar() {
        return aChar;
    }

    public void setChar(Char aChar) {
        this.aChar = aChar;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }
}
