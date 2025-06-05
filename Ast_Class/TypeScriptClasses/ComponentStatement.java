package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class ComponentStatement extends Statment
{
private Component component;

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        if(component!=null)
            component.accept(astVisitor);
    }


    public Component getComponent() {
        return component;
    }


    public void setComponent(Component component) {
        this.component = component;
    }
}
