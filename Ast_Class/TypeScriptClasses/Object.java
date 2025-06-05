package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Object extends Node {
    private String name;
    private Data data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }

    StringBuilder s = new StringBuilder();
    String st = "";
    String st1 = "";

    @Override
    public String getValue() {
        if (name != null) {
            st = name + " : ";
        }
        if (data != null) {
            st1 = data.getValue();
        }

        return st + st1;
    }
}
