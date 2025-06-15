package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Variable extends Node implements Info {
    private String number;
    private String string;
    private String bool;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getBool() {
        return bool;
    }

    public void setBool(String bool) {
        this.bool = bool;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }

    StringBuilder s = new StringBuilder();
    String st="";
    @Override
    public String getValue() {
        if (number != null) {
            st=number;
        }
        if (string != null) {
            st=string;
        }
        if (bool != null) {
            st=bool;
        }
        return st;
    }
}
