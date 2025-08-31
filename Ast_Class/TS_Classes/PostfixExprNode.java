package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class PostfixExprNode extends Node {
    private Node base; // primary

    // ترتيب العمليات على السلسلة: 'p' = .prop ، 'P' = ?.prop ، 'n' = !.prop
    // 'c' = (...) ، 'C' = ?.(...) ، 'i' = [expr] ، 'I' = ?.[expr]
    private ArrayList<Character> order = new ArrayList<>();
    private ArrayList<String>    propNames = new ArrayList<>();
    private ArrayList<Node>      callArgs  = new ArrayList<>(); // ArgumentListNode أو null
    private ArrayList<Node>      indexExprs= new ArrayList<>();

    public Node getBase() { return base; }
    public void setBase(Node base) { this.base = base; }

    public ArrayList<Character> getOrder() { return order; }
    public ArrayList<String> getPropNames() { return propNames; }
    public ArrayList<Node> getCallArgs() { return callArgs; }
    public ArrayList<Node> getIndexExprs() { return indexExprs; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (base != null) sb.append(base.getValue());

        int p = 0, c = 0, i = 0;
        for (char k : order) {
            switch (k) {
                case 'p': sb.append('.').append(propNames.get(p++)); break;
                case 'P': sb.append("?.").append(propNames.get(p++)); break;
                case 'n': sb.append("!.").append(propNames.get(p++)); break;
                case 'c':
                    sb.append('(').append(callArgs.get(c) != null ? callArgs.get(c).getValue() : "").append(')');
                    c++;
                    break;
                case 'C':
                    sb.append("?.(").append(callArgs.get(c) != null ? callArgs.get(c).getValue() : "").append(')');
                    c++;
                    break;
                case 'i':
                    sb.append('[').append(indexExprs.get(i).getValue()).append(']');
                    i++;
                    break;
                case 'I':
                    sb.append("?.[").append(indexExprs.get(i).getValue()).append(']');
                    i++;
                    break;
            }
        }
        return sb.toString();
    }
}
