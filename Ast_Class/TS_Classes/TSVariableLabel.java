package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TSVariableLabel extends Node implements TsSectionNode {

    private String keyword; // LET | CONST | VAR
    private String name;
    private Type type;
    private ExpressionNode value;


    public String getKeyword() {
        return keyword;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public ExpressionNode getValueExpression() {
        return value;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setValue(ExpressionNode value) {
        this.value = value;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append(keyword.toLowerCase()).append(" ");
        sb.append(name).append(": ").append(type.getValue());
        if (value != null) {
            sb.append(" = ").append(value.getValue());
        }
        sb.append(";");
        return sb.toString();
    }

}
