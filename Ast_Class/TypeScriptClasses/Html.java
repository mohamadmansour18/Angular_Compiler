package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class Html extends Content {
    private HtmlElement htmlElement;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if(htmlElement!=null)
            htmlElement.accept(ast_Visitor);
    }

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }
}
