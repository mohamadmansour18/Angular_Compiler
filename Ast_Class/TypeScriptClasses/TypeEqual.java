package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TypeEqual extends Node {
    private Variable variable;
    private CullFunction cullFunction;
    private AccessStatement accessStatement;
    private TypeCurles typeCurles;

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public CullFunction getCullFunction() {
        return cullFunction;
    }

    public void setCullFunction(CullFunction cullFunction) {
        this.cullFunction = cullFunction;
    }

    public AccessStatement getAccessStatement() {
        return accessStatement;
    }

    public void setAccessStatement(AccessStatement accessStatement) {
        this.accessStatement = accessStatement;
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
