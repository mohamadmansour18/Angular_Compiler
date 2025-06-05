package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class BaseExpression extends Node {
    private Litiral litiral;
    private String id;
    private FunctionCall functionCall;
    private ArrayLitiral arrayLitiral;
    private ObjectLitiral objectLitiral;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    public Litiral getLitiral() {
        return litiral;
    }

    public void setLitiral(Litiral litiral) {
        this.litiral = litiral;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public ArrayLitiral getArrayLitiral() {
        return arrayLitiral;
    }

    public void setArrayLitiral(ArrayLitiral arrayLitiral) {
        this.arrayLitiral = arrayLitiral;
    }

    public ObjectLitiral getObjectLitiral() {
        return objectLitiral;
    }

    public void setObjectLitiral(ObjectLitiral objectLitiral) {
        this.objectLitiral = objectLitiral;
    }
}
