package Ast_Class.TypeScriptClasses;


import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Element extends Node {
    private Html html;
    private AngularComponents angularComponents;

    public Html getHtml() {
        return html;
    }

    public void setHtml(Html html) {
        this.html = html;
    }

    public AngularComponents getAngularComponents() {
        return angularComponents;
    }

    public void setAngularComponents(AngularComponents angularComponents) {
        this.angularComponents = angularComponents;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }
}
