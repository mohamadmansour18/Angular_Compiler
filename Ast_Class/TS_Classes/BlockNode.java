package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
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
}
