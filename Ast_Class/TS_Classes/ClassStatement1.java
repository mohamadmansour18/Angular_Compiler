package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ClassStatement1 extends Node implements Stetment{
    private boolean exported;
    private String name;
    private ClassBodyNode body; // من قاعدة classBody

    public boolean isExported() {
        return exported;
    }

    public void setExported(boolean exported) {
        this.exported = exported;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassBodyNode getBody() {
        return body;
    }

    public void setBody(ClassBodyNode body) {
        this.body = body;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();

        if (exported) {
            sb.append("export ");
        }
        sb.append("class ").append(name).append(" {\n");

        if (body != null) {
            String bodyStr = body.getValue();
            if (bodyStr != null && !bodyStr.isEmpty()) {
                sb.append("  ").append(bodyStr.replace("\n", "\n  ")).append("\n");
            }
        }

        sb.append("}");
        return sb.toString();
    }
}
