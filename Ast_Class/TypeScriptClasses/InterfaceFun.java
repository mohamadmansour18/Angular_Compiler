package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class InterfaceFun extends Node {
    private String name;
    private Prameters prameters;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prameters getPrameters() {
        return prameters;
    }

    public void setPrameters(Prameters prameters) {
        this.prameters = prameters;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
