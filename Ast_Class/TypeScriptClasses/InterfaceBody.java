package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class InterfaceBody extends Node {
    private InterfaceFun interfaceFun;
    private InterfaceVar interfaceVar;

    public InterfaceFun getInterfaceFun() {
        return interfaceFun;
    }

    public void setInterfaceFun(InterfaceFun interfaceFun) {
        this.interfaceFun = interfaceFun;
    }

    public InterfaceVar getInterfaceVar() {
        return interfaceVar;
    }

    public void setInterfaceVar(InterfaceVar interfaceVar) {
        this.interfaceVar = interfaceVar;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
