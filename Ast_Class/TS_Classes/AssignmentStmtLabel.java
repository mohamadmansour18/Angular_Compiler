package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class AssignmentStmtLabel extends Node implements StatementNode{

    private boolean isThis; // هل تحتوي على this؟
    private String identifier;
    private ExpressionNode value;

    public boolean isThis() {
        return isThis;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ExpressionNode getValueExpression() {
        return value;
    }

    public void setThis(boolean aThis) {
        isThis = aThis;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
        String prefix = isThis ? "this." : "";
        return prefix + identifier + " = " + value.getValue() + ";";
    }
}
