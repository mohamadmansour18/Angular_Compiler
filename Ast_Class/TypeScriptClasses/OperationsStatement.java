package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class OperationsStatement extends Node implements Stetment {
    private AccessStatement access;
    private Equal equal;

    public AccessStatement getAccess() {
        return access;
    }

    public void setAccess(AccessStatement access) {
        this.access = access;
    }

    public Equal getEqual() {
        return equal;
    }

    public void setEqual(Equal equal) {
        this.equal = equal;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }


}
