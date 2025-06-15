package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class FunctionStatement extends Node implements Stetment {
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

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
