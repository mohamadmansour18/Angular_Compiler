package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Culls extends Node {
    private String name;
    private CullFunction cullFunction;
    private Array array;

    public CullFunction getCullFunction() {
        return cullFunction;
    }

    public void setCullFunction(CullFunction cullFunction) {
        this.cullFunction = cullFunction;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accept(AST_Visitor astVisitor){
        astVisitor.visit(this);
    }
}
