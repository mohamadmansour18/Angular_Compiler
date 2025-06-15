package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class PrefixStatement extends Node implements Stetment {
    private String identifier;
    private String minusOfplus;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getMinusOfplus() {
        return minusOfplus;
    }

    public void setMinusOfplus(String minusOfplus) {
        this.minusOfplus = minusOfplus;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }
}
