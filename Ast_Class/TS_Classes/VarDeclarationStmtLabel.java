package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class VarDeclarationStmtLabel extends Node implements StatementNode{

    private String modifier; // let | const | var
    private String name;
    private Type type;
    private ExpressionNode expression; // optional

    public VarDeclarationStmtLabel(String modifier, String name, Type type, ExpressionNode expression) {
        this.modifier = modifier;
        this.name = name;
        this.type = type;
        this.expression = expression;
    }

    public String getModifier() {
        return modifier;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setExpression(ExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append(modifier).append(" ").append(name).append(": ").append(type.getValue());
        if (expression != null) {
            sb.append(" = ").append(expression.getValue());
        }
        sb.append(";");
        return sb.toString();
    }

}
