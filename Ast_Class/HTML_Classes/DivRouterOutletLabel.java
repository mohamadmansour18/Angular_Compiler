package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class DivRouterOutletLabel extends Node implements DivContentNode {

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "<router-outlet></router-outlet>";
    }

    @Override
    public String generate(GenContext ctx) {
        return "<router-outlet></router-outlet>";
    }
}
