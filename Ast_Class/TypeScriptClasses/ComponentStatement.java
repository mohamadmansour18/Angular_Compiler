package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ComponentStatement extends Node implements Stetment
{
    private String component;
    private Objects objects;
    private TemplateStatement templateStatement ;

    public TemplateStatement getTemplateStatement() {
        return templateStatement;
    }

    public void setTemplateStatement(TemplateStatement templateStatement) {
        this.templateStatement = templateStatement;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Objects getObjects() {
        return objects;
    }

    public void setObjects(Objects objects) {
        this.objects = objects;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
