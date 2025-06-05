package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class HtmlElement extends Node {

    private TagOpen tagOpen;
    private TagClose tagClose;
    private ElementContent elementContent;
    private TagOpenEmpty tagOpenEmpty;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if(tagClose!=null)
            tagClose.accept(ast_Visitor);
        if(tagOpen!=null)
            tagOpen.accept(ast_Visitor);
        if(elementContent!=null)
            elementContent.accept(ast_Visitor);
        if(tagOpenEmpty!=null)
            tagOpenEmpty.accept(ast_Visitor);
    }

    public TagOpen getTagOpen() {
        return tagOpen;
    }

    public void setTagOpen(TagOpen tagOpen) {
        this.tagOpen = tagOpen;
    }

    public TagClose getTagClose() {
        return tagClose;
    }

    public void setTagClose(TagClose tagClose) {
        this.tagClose = tagClose;
    }

    public ElementContent getElementContent() {
        return elementContent;
    }

    public void setElementContent(ElementContent elementContent) {
        this.elementContent = elementContent;
    }

    public TagOpenEmpty getTagOpenEmpty() {
        return tagOpenEmpty;
    }

    public void setTagOpenEmpty(TagOpenEmpty tagOpenEmpty) {
        this.tagOpenEmpty = tagOpenEmpty;
    }
}
