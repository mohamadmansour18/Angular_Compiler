package Ast_Class.TS_Classes;
import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ParenExpressionLabel extends Node implements ExpressionNode{

    private ExpressionNode inner;

    public ExpressionNode getInner() {
        return inner;
    }

    public void setInner(ExpressionNode inner) {
        this.inner = inner;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "(" + inner.getValue() + ")";
    }
}
