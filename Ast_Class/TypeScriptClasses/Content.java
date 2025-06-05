package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Content extends Node {
    private TextLable textLable;
    private Html html;
    private AngularComponent component;
    private Dirictive dirictive;
    private Charcter charcter;

    public TextLable getTextLable() {
        return textLable;
    }

    public void setTextLable(TextLable textLable) {
        this.textLable = textLable;
    }

    public Html getHtml() {
        return html;
    }

    public void setHtml(Html html) {
        this.html = html;
    }

    public AngularComponent getComponent() {
        return component;
    }

    public void setComponent(AngularComponent component) {
        this.component = component;
    }

    public Dirictive getDirictive() {
        return dirictive;
    }

    public void setDirictive(Dirictive dirictive) {
        this.dirictive = dirictive;
    }

    public Charcter getCharcter() {
        return charcter;
    }

    public void setCharcter(Charcter charcter) {
        this.charcter = charcter;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }


    @Override
    public String getValue() {
        if(dirictive!=null) {
            return dirictive.getValue();
        }
        return "";
    }

}
