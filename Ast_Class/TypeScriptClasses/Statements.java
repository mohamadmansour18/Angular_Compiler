package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Statements extends Node {
    private String export;
    private String att;
    private Statment statment;

    public Statment getStatment() {
        return statment;
    }

    public void setStatment(Statment statment) {
        this.statment = statment;
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public String getAtt() {
        return att;
    }

    public void setAtt(String att) {
        this.att = att;
    }

    public void accept(AST_Visitor astVisitor){
        astVisitor.visit(this);
    }
}
