package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Statements extends Node {
    private String export;
    private String Await;
    private Stetment stetment;

    public Stetment getStetment() {
        return stetment;
    }

    public void setStetment(Stetment stetment) {
        this.stetment = stetment;
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public String getAwait() {
        return Await;
    }

    public void setAwait(String att) {
        this.Await = att;
    }

    public void accept(AST_Visitor astVisitor){
        astVisitor.visit(this);
    }
}
