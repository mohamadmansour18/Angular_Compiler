package Ast_Class.TS_Classes;

import Visitor.AST_Visitor;
import Ast_Class.Node.Node;

public class Type extends Node {

    // يمثل النوع كما ظهر في الكود (مثل string، number، User، User[])
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

}