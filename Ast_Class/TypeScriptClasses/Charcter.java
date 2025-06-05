package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Charcter extends Content {
    private Char aChar;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    public Char getaChar() {
        return aChar;
    }

    public void setaChar(Char aChar) {
        this.aChar = aChar;
    }
}
