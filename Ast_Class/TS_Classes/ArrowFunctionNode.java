package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ArrowFunctionNode extends Node {
    private ArrayList<String> params = new java.util.ArrayList<>();
    private boolean parenthesizedParams; // true إذا كانت الصيغة ( ... ) =>

    private Node body; // expr أو block

    public ArrayList<String> getParams() { return params; }
    public void setParams(java.util.ArrayList<String> params) { this.params = params; }

    public boolean isParenthesizedParams() { return parenthesizedParams; }
    public void setParenthesizedParams(boolean parenthesizedParams) { this.parenthesizedParams = parenthesizedParams; }

    public Node getBody() { return body; }
    public void setBody(Node body) { this.body = body; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }


    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();

        if (parenthesizedParams || params.size() != 1) {
            sb.append("(");
            for (int i = 0; i < params.size(); i++) {
                sb.append(params.get(i));
                if (i < params.size() - 1) sb.append(", ");
            }
            sb.append(")");
        } else {
            sb.append(params.get(0)); // single param بدون أقواس
        }

        sb.append(" => ");
        sb.append(body != null ? body.getValue() : "");
        return sb.toString();
    }
}
