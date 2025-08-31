package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class SignalGenericArgsNode extends Node {
    private ArrayList<SignalGenericArgNode> args = new ArrayList<>();

    public ArrayList<SignalGenericArgNode> getArgs() {
        return args;
    }

    public void setArgs(ArrayList<SignalGenericArgNode> args) {
        this.args = args;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.size(); i++) {
            sb.append(args.get(i).getValue());
            if (i < args.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        return " ";
    }
}
