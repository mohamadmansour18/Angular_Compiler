package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class AssignmentExprNode extends Node {
    private Node left;         // assignable
    private Node right;        // assignmentExpr (مُتكرر يمينًا)
    private Node conditional;  // عندما يكون البديل conditionalExpr

    public Node getLeft() { return left; }
    public void setLeft(Node left) { this.left = left; }

    public Node getRight() { return right; }
    public void setRight(Node right) { this.right = right; }

    public Node getConditional() { return conditional; }
    public void setConditional(Node conditional) { this.conditional = conditional; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        if (left != null) {
            return left.getValue() + " = " + (right != null ? right.getValue() : "");
        }
        return (conditional != null) ? conditional.getValue() : "";
    }
}
