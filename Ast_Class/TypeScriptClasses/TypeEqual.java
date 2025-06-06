package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TypeEqual extends Node {
    private NumberStringBool numberStringBool;
    private CullFunction cullFunction;
    private Access access;
    private TypeCurles typeCurles;

    public NumberStringBool getNumberStringBool() {
        return numberStringBool;
    }

    public void setNumberStringBool(NumberStringBool numberStringBool) {
        this.numberStringBool = numberStringBool;
    }

    public CullFunction getCullFunction() {
        return cullFunction;
    }

    public void setCullFunction(CullFunction cullFunction) {
        this.cullFunction = cullFunction;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public TypeCurles getTypeCurles() {
        return typeCurles;
    }

    public void setTypeCurles(TypeCurles typeCurles) {
        this.typeCurles = typeCurles;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
