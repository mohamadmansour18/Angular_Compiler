package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Info extends Node {
    private Variable variable;
    private ObjectsLable objectsLable;
    private CallFunction callFunctionLable;
    private AccessLable accessLable;
    private AngularTemplet templetLable;
    private QutAngular qutAngular;
    private ArratLable arratLable;

    public ArratLable getArratLable() {
        return arratLable;
    }

    public void setArratLable(ArratLable arratLable) {
        this.arratLable = arratLable;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public ObjectsLable getObjectsLable() {
        return objectsLable;
    }

    public void setObjectsLable(ObjectsLable objectsLable) {
        this.objectsLable = objectsLable;
    }

    public CallFunction getCallFunctionLable() {
        return callFunctionLable;
    }

    public void setCallFunctionLable(CallFunction callFunctionLable) {
        this.callFunctionLable = callFunctionLable;
    }

    public AccessLable getAccessLable() {
        return accessLable;
    }

    public void setAccessLable(AccessLable accessLable) {
        this.accessLable = accessLable;
    }

    public AngularTemplet getTempletLable() {
        return templetLable;
    }

    public void setTempletLable(AngularTemplet templetLable) {
        this.templetLable = templetLable;
    }

    public QutAngular getQutAngular() {
        return qutAngular;
    }

    public void setQutAngular(QutAngular qutAngular) {
        this.qutAngular = qutAngular;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }
}
