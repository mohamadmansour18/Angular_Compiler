package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
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
}
