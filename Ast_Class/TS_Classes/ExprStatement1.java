package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class ExprStatement1 extends Node implements Stetment{
    private Node expr; // من قاعدة expr

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
        return (expr != null ? expr.getValue() : "") + ";";
    }

    @Override
    public String generate(GenContext ctx) {
        if (expr == null) return "";

        String e = expr.generate(ctx);
        if (e == null) return "";
        e = e.trim();
        if (e.isEmpty()) return "";

        if (e.endsWith(";")) {
            e = e.substring(0, e.length() - 1).trim();
        }

        return e + ";";
    }
}
