package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ComponentStatement extends Node implements Stetment
{
    private String component;
    private ObjectsLable objectsLable;
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

    public ObjectsLable getObjectsLable() {
        return objectsLable;
    }

    public void setObjectsLable(ObjectsLable objectsLable) {
        this.objectsLable = objectsLable;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
