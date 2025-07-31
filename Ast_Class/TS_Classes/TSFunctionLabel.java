package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TSFunctionLabel extends Node implements TsSectionNode {

    private boolean isAsync;
    private String name;
    private ParameterList parameterList;
    private Type returnType;
    private Block body;


    public boolean isAsync() {
        return isAsync;
    }

    public String getName() {
        return name;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public Type getReturnType() {
        return returnType;
    }

    public Block getBody() {
        return body;
    }

    public void setAsync(boolean async) {
        isAsync = async;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public void setBody(Block body) {
        this.body = body;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (isAsync) sb.append("async ");
        sb.append("function ").append(name).append("(");
        if (parameterList != null)
            sb.append(parameterList.getValue());
        sb.append("): ").append(returnType.getValue()).append(" ");
        sb.append(body.getValue());
        return sb.toString();
    }

}
