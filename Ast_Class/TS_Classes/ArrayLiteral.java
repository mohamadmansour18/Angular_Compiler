package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ArrayLiteral extends Node {

    private ArrayList<ExpressionNode> elements = new ArrayList<>();

    public ArrayList<ExpressionNode> getElements() {
        return elements;
    }

    public void setElements(ArrayList<ExpressionNode> elements) {
        this.elements = elements;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < elements.size(); i++) {
            sb.append(elements.get(i).getValue());
            if (i < elements.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
