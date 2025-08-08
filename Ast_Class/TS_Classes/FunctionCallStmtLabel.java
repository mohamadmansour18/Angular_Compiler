package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class FunctionCallStmtLabel extends Node implements StatementNode {
    private boolean isThis;
    private String functionName;
    private ArgumentList arguments;

    public boolean isThis() {
        return isThis;
    }

    public String getFunctionName() {
        return functionName;
    }

    public ArgumentList getArguments() {
        return arguments;
    }

    public void setThis(boolean aThis) {
        isThis = aThis;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void setArguments(ArgumentList arguments) {
        this.arguments = arguments;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        String prefix = isThis ? "this." : "";
        String args = arguments != null ? arguments.getValue() : "";
        return prefix + functionName + "(" + args + ");";
    }
}
