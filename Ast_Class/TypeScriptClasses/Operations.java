package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Operations extends Node {
    private Access access;
    private Equal equal;

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public Equal getEqual() {
        return equal;
    }

    public void setEqual(Equal equal) {
        this.equal = equal;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("Operations Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (access != null) {
            access.accept(astVisitor);
        }
        if (equal != null) {
            equal.accept(astVisitor);
        }
        System.out.println("**********************************************");

    }
}
