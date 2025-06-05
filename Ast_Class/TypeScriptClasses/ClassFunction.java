package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ClassFunction extends Node {
    private String name;
    private Header header;
    private Body body;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}

