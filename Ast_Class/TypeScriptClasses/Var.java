package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Var extends Node {
    private String name;
    private Type type;
    private Equal equal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Equal getEqual() {
        return equal;
    }

    public void setEqual(Equal equal) {
        this.equal = equal;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("Variable Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (name != null) {
            System.out.println("var name: " + name);
        }
        if (type != null) {
            System.out.println("var type: ");
            type.accept(astVisitor);
        }
        if (equal != null) {
            System.out.println("var value: ");
            equal.accept(astVisitor);
        }
        System.out.println("**********************************************");

    }
StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringtype=new StringBuilder();
    @Override
    public String getValue() {
        if(equal!=null)
        {
            stringBuilder.append(equal);
        }
        return stringBuilder.toString();
    }
    public String getTypes(){
        if(type!=null)
        {
            stringtype.append(type.getValue());
        }
        return stringtype.toString();
    }
}
