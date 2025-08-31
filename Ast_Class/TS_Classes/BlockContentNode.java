package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class BlockContentNode extends Node {
    private ArrayList<Node> statements = new ArrayList<>();

    public ArrayList<Node> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Node> statements) {
        this.statements = statements;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < statements.size(); i++) {
            sb.append(statements.get(i).getValue());
            if (i < statements.size() - 1) sb.append("\n");
        }
        return sb.toString();
    }
}
