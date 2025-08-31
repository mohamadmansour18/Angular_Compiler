package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ParamListSimpleNode extends Node {
    private ArrayList<String> params = new ArrayList<>();

    public ArrayList<String> getParams() {
        return params;
    }

    public void setParams(ArrayList<String> params) {
        this.params = params;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < params.size(); i++) {
            sb.append(params.get(i));
            if (i < params.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        if (params == null || params.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < params.size(); i++) {
            String name = params.get(i);
            if (name == null || name.isBlank()) name = "_p" + i;
            sb.append(name);
            if (i < params.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}
