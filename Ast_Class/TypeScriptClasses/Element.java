package Ast_Class.TypeScriptClasses;


import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Element extends Node {
    private HtmlElement htmlElement;
    private Angular angular;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    public Angular getAngular() {
        return angular;
    }

    public void setAngular(Angular angular) {
        this.angular = angular;
    }
}
