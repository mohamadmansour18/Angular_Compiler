package Ast_Class.TS_Classes;
import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ArrayAccessExpressionLabel extends Node implements ExpressionNode {
    private ExpressionNode array;
    private ExpressionNode index;

    public ExpressionNode getArray() {
        return array;
    }

    public ExpressionNode getIndex() {
        return index;
    }

    public void setArray(ExpressionNode array) {
        this.array = array;
    }

    public void setIndex(ExpressionNode index) {
        this.index = index;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return array.getValue() + "[" + index.getValue() + "]";
    }
}
