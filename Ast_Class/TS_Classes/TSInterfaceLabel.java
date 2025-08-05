package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TSInterfaceLabel extends Node implements TsSectionNode {

    private String name;
    private InterfaceBody body;

    public String getName() {
        return name;
    }

    public InterfaceBody getBody() {
        return body;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBody(InterfaceBody body) {
        this.body = body;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "export interface " + name + " " + body.getValue();
    }

}
