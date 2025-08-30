package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ProgramNode extends Node {
    private ArrayList<StatementsNode> statements = new ArrayList<>();

    public ArrayList<StatementsNode> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<StatementsNode> statements) {
        this.statements = statements;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();

        for (StatementsNode st : statements) {
            sb.append(st.getValue()).append("\n");
        }

        return sb.toString().trim();
    }
}
