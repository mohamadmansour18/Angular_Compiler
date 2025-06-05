package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class NumberStringBool extends Node {
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
        System.out.println("**********************************************");
        System.out.println("Number_String_bool Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (number != null) {
            System.out.println("value is number: " + number);
        }
        if (string != null) {
            System.out.println("value is string: " + string);
        }
        if (bool != null) {
            System.out.println("value is boolean: " + bool);
        }
        System.out.println("**********************************************");

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
