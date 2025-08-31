package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String generate(GenContext ctx) {

        if (params == null || params.isEmpty())
            return "";

        List<String> pieces = new ArrayList<>();
        int auto = 0;

        for (ParamNode p : params) {
            if (p == null) continue;

            String piece = p.generate(ctx);
            piece = (piece == null) ? "" : piece.trim();

            if (piece.isEmpty()) piece = "_p" + (auto++);
            pieces.add(piece);
        }

        return String.join(", ", pieces);
    }
}
