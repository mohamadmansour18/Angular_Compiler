package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class SignalGenericCallPrimaryNode extends Node {
    private Node genericArgs;   // من قاعدة signalGenericArgs
    private Node argumentList;  // من قاعدة argumentList (اختياري)

    public Node getGenericArgs() { return genericArgs; }
    public void setGenericArgs(Node genericArgs) { this.genericArgs = genericArgs; }

    public Node getArgumentList() { return argumentList; }
    public void setArgumentList(Node argumentList) { this.argumentList = argumentList; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("signal<");
        if (genericArgs != null) sb.append(genericArgs.getValue());
        sb.append(">(");
        if (argumentList != null) sb.append(argumentList.getValue());
        sb.append(")");
        return sb.toString();
    }
}
