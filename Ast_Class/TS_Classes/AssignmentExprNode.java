package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
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

    @Override
    public String generate(GenContext ctx) {
        // بديل 1: assignable '=' assignmentExpr
        if (left != null) {
            String L = left.generate(ctx);
            String R = null;

            if (right != null) {
                R = right.generate(ctx);
            } else if (conditional != null) {
                R = conditional.generate(ctx);
            }


            L = (L == null) ? "" : L.trim();
            R = (R == null) ? "undefined" : R.trim();


            if (R.endsWith(";")) R = R.substring(0, R.length() - 1).trim();

            // الناتج: L = R
            return L + " = " + R;
        }

        // بديل 2: conditionalExpr
        if (conditional != null) {
            String c = conditional.generate(ctx);
            if (c == null) return "";
            c = c.trim();
            if (c.endsWith(";")) c = c.substring(0, c.length() - 1).trim();
            return c;
        }

        return "";
    }
}
