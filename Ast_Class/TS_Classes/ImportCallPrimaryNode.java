package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ImportCallPrimaryNode extends Node {
    private String moduleLiteral; // STRING مع علامات التنصيص
    private ArrayList<String> callNames = new ArrayList<>();
    private ArrayList<ArgumentListNode> callArgs = new ArrayList<>(); // قد تحتوي null

    public String getModuleLiteral() { return moduleLiteral; }
    public void setModuleLiteral(String moduleLiteral) { this.moduleLiteral = moduleLiteral; }

    public ArrayList<String> getCallNames() { return callNames; }
    public ArrayList<ArgumentListNode> getCallArgs() { return callArgs; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("import(").append(moduleLiteral != null ? moduleLiteral : "").append(")");
        for (int i = 0; i < callNames.size(); i++) {
            sb.append(".").append(callNames.get(i)).append("(");
            ArgumentListNode args = callArgs.get(i);
            if (args != null) sb.append(args.getValue());
            sb.append(")");
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // تنظيف: إزالة ';' النهائية إن وُجدت
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        String mod = (moduleLiteral != null && !moduleLiteral.isBlank()) ? moduleLiteral : "''";

        if (callNames == null || callNames.isEmpty()) {
            return "import(" + mod + ")";
        }

        if ("then".equals(callNames.get(0))) {
            StringBuilder sb = new StringBuilder();
            sb.append("import(").append(mod).append(")");
            for (int i = 0; i < callNames.size(); i++) {
                String name = callNames.get(i);
                ArgumentListNode argsNode = (i < callArgs.size()) ? callArgs.get(i) : null;
                String args = (argsNode != null) ? clean.apply(argsNode.generate(ctx)) : "";
                sb.append(".").append(name).append("(").append(args).append(")");
            }
            return sb.toString();
        }

        StringBuilder chain = new StringBuilder("m");
        for (int i = 0; i < callNames.size(); i++) {
            String name = callNames.get(i);
            ArgumentListNode argsNode = (i < callArgs.size()) ? callArgs.get(i) : null;
            String args = (argsNode != null) ? clean.apply(argsNode.generate(ctx)) : "";
            chain.append(".").append(name).append("(").append(args).append(")");
        }

        // import("...").then(m => m.foo(...).bar(...))
        return "import(" + mod + ").then(m => " + chain + ")";
    }
}
