package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ArgumentList extends Node {

    private ArrayList<ExpressionNode> arguments = new ArrayList<>();

    public ArgumentList(ArrayList<ExpressionNode> arguments) {
        this.arguments = arguments;
    }

    public ArrayList<ExpressionNode> getArguments() {
        return arguments;
    }

    public void setArguments(ArrayList<ExpressionNode> arguments) {
        this.arguments = arguments;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i).getValue());
            if (i < arguments.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

}
