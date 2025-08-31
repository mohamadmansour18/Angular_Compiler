package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ParamListNode extends Node {
    private ArrayList<ParamNode> params = new ArrayList<>();

    public ArrayList<ParamNode> getParams() {
        return params;
    }

    public void setParams(ArrayList<ParamNode> params) {
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
            sb.append(params.get(i).getValue());
            if (i < params.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}
