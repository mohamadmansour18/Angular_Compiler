package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Equal extends Node {
    private Data data;
    private String name;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }

    StringBuilder s = new StringBuilder();

    @Override
    public String getValue() {
        if (data != null) {
            s.append(data.getValue());
        }
        if (name != null) {
            s.append(name);
        }
        return s.toString();
    }
}
