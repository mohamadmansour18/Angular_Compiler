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
        System.out.println("**********************************************");
        System.out.println("Equal Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (data != null) {
            System.out.println("the value data");
            data.accept(astVisitor);
        }
        if (name != null) {
            System.out.println("change type to another: " + name);
        }
        System.out.println("**********************************************");

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
