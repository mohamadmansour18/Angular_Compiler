package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ImportStatement extends Node implements Stetment {
    ArrayList<String> strings = new ArrayList<>();
    ArrayList <String >Ids = new ArrayList<>();
    String url ;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    public ArrayList<String> getIds() {
        return Ids;
    }

    public void setIds(ArrayList<String> ids) {
        Ids = ids;
    }

    public void accept(AST_Visitor astVisitor){
        astVisitor.visit(this);
    }
}
