package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class ArratLable extends Info {
    private Array array;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }
}
