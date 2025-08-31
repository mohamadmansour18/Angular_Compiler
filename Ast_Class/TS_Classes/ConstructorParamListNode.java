package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;
import java.util.List;

public class ConstructorParamListNode extends Node {
    private ArrayList<ConstructorParamNode> params = new ArrayList<>();

    public ArrayList<ConstructorParamNode> getParams() {
        return params;
    }

    public void setParams(ArrayList<ConstructorParamNode> params) {
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
            if (i < params.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {

        if (this.params == null || this.params.isEmpty()) {
            return "";
        }

        List<String> pieces = new ArrayList<>();
        int auto = 0;

        for (ConstructorParamNode p : this.params) {
            if (p == null) continue;

            String name = p.getName();
            if (name == null || name.isBlank()) {
                name = "_p" + (auto++);
            }

            pieces.add(name);
        }

        return String.join(", ", pieces);
    }
}
