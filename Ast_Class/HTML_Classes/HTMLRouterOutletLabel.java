package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class HTMLRouterOutletLabel extends Node implements HtmlSectionNode {

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "<router-outlet></router-outlet>";
    }
}
