package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class AngularComponent extends Content {
    private Angular angular;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    public Angular getAngular() {
        return angular;
    }

    public void setAngular(Angular angular) {
        this.angular = angular;
    }
}
