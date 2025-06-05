package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Access extends Node {
    private ArrayList<Culls> culls = new ArrayList<>();

    public ArrayList<Culls> getCulls() {
        return culls;
    }

    public void setCulls(ArrayList<Culls> culls) {
        this.culls = culls;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }

    StringBuilder s = new StringBuilder();

    @Override
    public String getValue() {
        if (culls != null) {
            for (Culls c : culls) {
                s.append(c.getValue());
            }
            s.append(".");
        }
        return s.toString();
    }
}
