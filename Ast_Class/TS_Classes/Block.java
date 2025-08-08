package Ast_Class.TS_Classes;
import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Block extends Node {

    private ArrayList<StatementNode> statements = new ArrayList<>();

    public void setStatements(ArrayList<StatementNode> statements) {
        this.statements = statements;
    }

    public ArrayList<StatementNode> getStatements() {
        return statements;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (StatementNode stmt : statements) {
            sb.append("  ").append(stmt.getValue()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
