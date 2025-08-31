package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
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

    @Override
    public String generate(GenContext ctx) {
        // helper لتنظيف أي ';' زائدة.
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        // 1) الأساس (primary)
        String baseJs = (base != null) ? clean.apply(base.generate(ctx)) : "";
        if (baseJs.isEmpty()) baseJs = "undefined"; // احتياط
        StringBuilder sb = new StringBuilder(baseJs);

        // 2) تتبّع مؤشرات القوائم
        int p = 0; // propNames
        int c = 0; // callArgs
        int i = 0; // indexExprs

        // 3) طبّق السلسلة حسب order
        for (char k : order) {
            switch (k) {
                case 'p': { // .prop
                    String name = (p < propNames.size()) ? propNames.get(p++) : "";
                    sb.append(".").append(name);
                    break;
                }
                case 'P': { // ?.prop
                    String name = (p < propNames.size()) ? propNames.get(p++) : "";
                    sb.append("?.").append(name);
                    break;
                }
                case 'n': { // !.prop  => نحذف non-null assertion ونولّد وصولًا عاديًا
                    String name = (p < propNames.size()) ? propNames.get(p++) : "";
                    sb.append(".").append(name);
                    break;
                }
                case 'c': { // (args)
                    String args = "";
                    if (c < callArgs.size() && callArgs.get(c) != null) {
                        args = clean.apply(callArgs.get(c).generate(ctx));
                    }
                    sb.append("(").append(args).append(")");
                    c++;
                    break;
                }
                case 'C': { // ?.(args)
                    String args = "";
                    if (c < callArgs.size() && callArgs.get(c) != null) {
                        args = clean.apply(callArgs.get(c).generate(ctx));
                    }
                    sb.append("?.(").append(args).append(")");
                    c++;
                    break;
                }
                case 'i': { // [expr]
                    String idx = "";
                    if (i < indexExprs.size() && indexExprs.get(i) != null) {
                        idx = clean.apply(indexExprs.get(i).generate(ctx));
                    }
                    if (idx.isEmpty()) idx = "0"; // احتياط
                    sb.append("[").append(idx).append("]");
                    i++;
                    break;
                }
                case 'I': { // ?.[expr]
                    String idx = "";
                    if (i < indexExprs.size() && indexExprs.get(i) != null) {
                        idx = clean.apply(indexExprs.get(i).generate(ctx));
                    }
                    if (idx.isEmpty()) idx = "0"; // احتياط
                    sb.append("?.[").append(idx).append("]");
                    i++;
                    break;
                }
                default:
                    break;
            }
        }

        return sb.toString();
    }
}
