package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class StandalonePropertyNode extends Node {
    private boolean standalone; // قيمة true/false

    public boolean isStandalone() {
        return standalone;
    }

    public void setStandalone(boolean standalone) {
        this.standalone = standalone;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "standalone: " + standalone;
    }

    @Override
    public String generate(GenContext ctx) {
        return "standalone: " + (standalone ? "true" : "false");
    }
}
