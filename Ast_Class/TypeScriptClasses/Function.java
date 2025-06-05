package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Function extends Node {
    private String function;
    private ClassFunction classFunction;

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public ClassFunction getClassFunction() {
        return classFunction;
    }

    public void setClassFunction(ClassFunction classFunction) {
        this.classFunction = classFunction;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("Function declare Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (classFunction != null) {
            System.out.println("node for function details:");
            classFunction.accept(astVisitor);
        }
        System.out.println("**********************************************");

    }
}
