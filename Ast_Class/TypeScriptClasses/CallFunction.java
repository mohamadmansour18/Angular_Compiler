package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class CallFunction extends Info {
    private CullFunction cullFunction;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    public CullFunction getCullFunction() {
        return cullFunction;
    }

    public void setCullFunction(CullFunction cullFunction) {
        this.cullFunction = cullFunction;
    }
}
