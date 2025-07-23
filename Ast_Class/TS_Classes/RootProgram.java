package Ast_Class.TS_Classes;

import Ast_Class.HTML_Classes.HtmlSectionNode;
import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;


public class RootProgram extends Node {


    private ArrayList<HtmlSectionNode> htmlSections = new ArrayList<>();

    private ArrayList<TsSectionNode> tsSections = new ArrayList<>();

    public ArrayList<HtmlSectionNode> getHtmlSections() {
        return htmlSections;
    }

    public void setHtmlSections(ArrayList<HtmlSectionNode> htmlSections) {
        this.htmlSections = htmlSections;
    }

    public ArrayList<TsSectionNode> getTsSections() {
        return tsSections;
    }

    public void setTsSections(ArrayList<TsSectionNode> tsSections) {
        this.tsSections = tsSections;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (HtmlSectionNode htmlNode : htmlSections) {
            sb.append(htmlNode.getValue()).append("\n");
        }
        for (TsSectionNode tsNode : tsSections) {
            sb.append(tsNode.getValue()).append("\n");
        }
        return sb.toString();
    }
}
