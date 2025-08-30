package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class StatementsNode extends Node {
    private Stetment statement;
    private boolean hasSemicolon;

    public Stetment getStatement() {
        return statement;
    }

    public void setStatement(Stetment statement) {
        this.statement = statement;
    }

    public boolean isHasSemicolon() {
        return hasSemicolon;
    }

    public void setHasSemicolon(boolean hasSemicolon) {
        this.hasSemicolon = hasSemicolon;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();

        if (statement != null) {
            sb.append(statement.getValue());
        }

        if (hasSemicolon) {
            sb.append(";");
        }

        return sb.toString();
    }
}
