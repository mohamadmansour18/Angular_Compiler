package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TypeCurle extends Node {
    private String name;
    private String type;
    private Data data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void accept(AST_Visitor astVisitor) {
        System.out.println("**********************************************");
        System.out.println("TypeCurle Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (name != null) {
            System.out.println("type name : " + name);
        }
        if (type != null) {
            System.out.println("type: " + type);
        }
        if (data != null) {
            System.out.println("type date :");
            data.accept(astVisitor);
        }
        System.out.println("**********************************************");

    }
}
