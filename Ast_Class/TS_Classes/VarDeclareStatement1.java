package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class VarDeclareStatement1 extends Node implements Stetment{
    private boolean exported;                 // وجود EXPORT_KW
    private String kind;                      // "const" أو "let"
    private ArrayList<VarDeclNode> decls = new ArrayList<>();

    public boolean isExported() { return exported; }
    public void setExported(boolean exported) { this.exported = exported; }

    public String getKind() { return kind; }
    public void setKind(String kind) { this.kind = kind; }

    public ArrayList<VarDeclNode> getDecls() { return decls; }
    public void setDecls(ArrayList<VarDeclNode> decls) { this.decls = decls; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (exported) sb.append("export ");
        if (kind != null) sb.append(kind).append(" ");
        for (int i = 0; i < decls.size(); i++) {
            sb.append(decls.get(i).getValue());
            if (i < decls.size() - 1) sb.append(", ");
        }
        sb.append(";");
        return sb.toString();
    }
}
