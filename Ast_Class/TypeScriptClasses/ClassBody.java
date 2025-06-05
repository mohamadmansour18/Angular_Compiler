package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ClassBody extends Node {
    private Var var;
    private Constructor constructor;
    private ClassFunction classFunction;

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public ClassFunction getClassFunction() {
        return classFunction;
    }

    public void setClassFunction(ClassFunction classFunction) {
        this.classFunction = classFunction;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
