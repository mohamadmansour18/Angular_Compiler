package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class TextLable extends Content {
    private Text  text;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if(text!=null)
            text.accept(ast_Visitor);
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }
}


