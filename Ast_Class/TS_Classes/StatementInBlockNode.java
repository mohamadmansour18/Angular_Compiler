package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class StatementInBlockNode extends Node {
    private Node statement; // varDeclareStatement | exprStatement | ifStatement | returnStatement

    public Node getStatement() {
        return statement;
    }

    public void setStatement(Node statement) {
        this.statement = statement;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return (statement != null) ? statement.getValue() : "";
    }
}
