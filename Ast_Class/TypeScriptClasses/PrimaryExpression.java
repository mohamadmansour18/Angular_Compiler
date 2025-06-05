package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class PrimaryExpression extends Node {
    private Litiral literal;
    private String Id;
    private Expression expression;
    private FunctionCall functionCall;
    private ArrayLitiral arrayLitiral;
    private ObjectLitiral objectLitiral;
    private Pip pip;
    private Prop prop;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if (literal!=null)
            literal.accept(ast_Visitor);
        if(Id !=null)
            System.out.println(Id);
        if(expression!=null)
            expression.accept(ast_Visitor);
        if(functionCall!=null)
            functionCall.accept(ast_Visitor);
        if(arrayLitiral!=null)
            arrayLitiral.accept(ast_Visitor);
        if(objectLitiral!=null)
            objectLitiral.accept(ast_Visitor);
        if(pip!=null)
            pip.accept(ast_Visitor);
        if(prop!=null)
            prop.accept(ast_Visitor);
    }

    @Override
    public String getValue() {

            if (getId()!=null)
                return getId();
            return " ";
    }

    public Litiral getLiteral() {
        return literal;
    }

    public void setLiteral(Litiral literal) {
        this.literal = literal;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
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

    public Pip getPip() {
        return pip;
    }

    public void setPip(Pip pip) {
        this.pip = pip;
    }

    public Prop getProp() {
        return prop;
    }

    public void setProp(Prop prop) {
        this.prop = prop;
    }
}
