package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class BlockNode extends Node {
    private ArrayList<Node> items = new ArrayList<>();

    public ArrayList<Node> getItems() {
        return items;
    }

    public void setItems(ArrayList<Node> items) {
        this.items = items;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (Node n : items) {
            sb.append("  ").append(n.getValue()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        ctx.pushScope();

        StringBuilder sb = new StringBuilder();
        sb.append("{\n");

        ctx.in();
        for (Node n : items) {
            if (n == null) continue;

            String code = n.generate(ctx);
            if (code == null) continue;
            code = code.trim();
            if (code.isEmpty()) continue;

            sb.append(ctx.ind()).append(code).append("\n");
        }
        ctx.out();

        sb.append(ctx.ind()).append("}");

        ctx.popScope();
        return sb.toString();
    }
}
