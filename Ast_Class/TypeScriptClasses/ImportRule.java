package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ImportRule extends Node {
    ArrayList <String> strings=new ArrayList<>();
    ArrayList <String >Ids=new ArrayList<>();
String url;

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
        System.out.println("**********************************************");
        System.out.println("Import rule Node");
        System.out.println("Child Count"+this.getChildeCount());
        if(strings!=null)
        {
            for (String s:strings)
                System.out.println(s);
        }
        if(Ids!=null)
        {
            for (String s:Ids)
                System.out.println(s);

        }
        if(url!=null)
        {
            System.out.println("url for import: "+url);
        }
        System.out.println("**********************************************");

    }
}
