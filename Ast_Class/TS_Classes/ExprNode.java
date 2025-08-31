package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class ExprNode extends Node {
    private Node assignment; // من قاعدة assignmentExpr

    public Node getAssignment() { return assignment; }
    public void setAssignment(Node assignment) { this.assignment = assignment; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        return (assignment != null) ? assignment.getValue() : "";
    }

    @Override
    public String generate(GenContext ctx) {
        if (assignment == null) return "";
        String code = assignment.generate(ctx);
        return (code == null) ? "" : code.trim();
    }
}
