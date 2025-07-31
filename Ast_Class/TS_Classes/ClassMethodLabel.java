package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ClassMethodLabel extends Node implements StatementNode{

    private ArrayList<MethodModifier> modifiers = new ArrayList<>(); // public, private, static, ...
    private boolean isAsync;
    private String name;
    private ParameterList parameterList;
    private Type returnType;
    private Block body;

    public ArrayList<MethodModifier> getModifiers() {
        return modifiers;
    }

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

    public void setModifiers(ArrayList<MethodModifier> modifiers) {
        this.modifiers = modifiers;
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

        for (MethodModifier mod : modifiers) {
            sb.append(mod.getValue()).append(" ");
        }

        if (isAsync) sb.append("async ");

        sb.append(name).append("(");
        if (parameterList != null)
            sb.append(parameterList.getValue());
        sb.append("): ").append(returnType.getValue()).append(" ");
        sb.append(body.getValue());

        return sb.toString();
    }

}
