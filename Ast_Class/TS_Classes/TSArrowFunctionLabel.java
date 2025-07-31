package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TSArrowFunctionLabel extends Node implements TsSectionNode {
    private ParameterList parameterList;
    private Type returnType;
    private Block bodyBlock;
    private ExpressionNode bodyExpression;

    public ParameterList getParameterList() {
        return parameterList;
    }

    public Type getReturnType() {
        return returnType;
    }

    public Block getBodyBlock() {
        return bodyBlock;
    }

    public ExpressionNode getBodyExpression() {
        return bodyExpression;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public void setBodyBlock(Block bodyBlock) {
        this.bodyBlock = bodyBlock;
    }

    public void setBodyExpression(ExpressionNode bodyExpression) {
        this.bodyExpression = bodyExpression;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        if (parameterList != null)
            sb.append(parameterList.getValue());
        sb.append(")");
        if (returnType != null)
            sb.append(": ").append(returnType.getValue());
        sb.append(" => ");
        if (bodyBlock != null) {
            sb.append(bodyBlock.getValue());
        } else if (bodyExpression != null) {
            sb.append(bodyExpression.getValue());
        }
        return sb.toString();
    }
}
