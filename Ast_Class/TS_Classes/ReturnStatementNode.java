package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class ReturnStatementNode extends Node {
    private Node expr; // اختياري

    public Node getExpr() {
        return expr;
    }

    public void setExpr(Node expr) {
        this.expr = expr;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("return");
        if (expr != null) {
            sb.append(" ").append(expr.getValue());
        }
        sb.append(";");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        StringBuilder sb = new StringBuilder("return");

        if (expr != null) {
            String e = expr.generate(ctx);
            if (e != null) {
                e = e.trim();
                if (e.endsWith(";")) {
                    e = e.substring(0, e.length() - 1).trim();
                }
                if (!e.isEmpty()) {
                    sb.append(" ").append(e);
                }
            }
        }
        sb.append(";");
        return sb.toString();
    }

}
