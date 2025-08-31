package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String generate(GenContext ctx) {

        if (statements == null || statements.isEmpty()) return "";

        List<String> lines = new ArrayList<>();
        for (Node st : statements) {
            if (st == null) continue;
            String code = st.generate(ctx);
            if (code == null) continue;
            code = code.trim();
            if (code.isEmpty()) continue;
            lines.add(code);
        }

        return String.join("\n", lines);
    }
}
