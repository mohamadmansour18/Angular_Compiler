package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
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

    @Override
    public String generate(GenContext ctx) {

        if (statement == null) return "";

        String code = statement.generate(ctx);
        if (code == null) return "";
        String trimmed = code.trim();
        if (trimmed.isEmpty()) return "";


        boolean isBlockOrControl =
                trimmed.startsWith("{") ||
                trimmed.startsWith("if ") || trimmed.startsWith("if(") ||
                trimmed.startsWith("while ") || trimmed.startsWith("while(") ||
                trimmed.startsWith("for ") || trimmed.startsWith("for(") ||
                trimmed.startsWith("switch ") || trimmed.startsWith("switch(") ||
                trimmed.startsWith("function ") || trimmed.startsWith("class ");

        if (trimmed.endsWith(";") || isBlockOrControl) {
            return trimmed;
        }


        return trimmed + ";";
    }
}
