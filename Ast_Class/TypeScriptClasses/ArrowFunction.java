package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ArrowFunction extends Node {
    private Header header;
    private Body body;
    private BodyWithOutCurly bodyWithOutCurly;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public BodyWithOutCurly getBodyWithOutCurly() {
        return bodyWithOutCurly;
    }

    public void setBodyWithOutCurly(BodyWithOutCurly bodyWithOutCurly) {
        this.bodyWithOutCurly = bodyWithOutCurly;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
    @Override
    public String getValue() {
        return "";
    }
}
