package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TSEnumLabel extends Node implements TsSectionNode {

    private String name;
    private EnumBody body;

    public String getName() {
        return name;
    }

    public EnumBody getBody() {
        return body;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBody(EnumBody body) {
        this.body = body;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "export enum " + name + " " + body.getValue();
    }

}
