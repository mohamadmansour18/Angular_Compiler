package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class RootProgram extends Node {
    private ArrayList<ProgramNode> programs = new ArrayList<>();

    public ArrayList<ProgramNode> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<ProgramNode> programs) {
        this.programs = programs;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();

        for (ProgramNode p : programs) {
            sb.append(p.getValue()).append("\n");
        }

        return sb.toString().trim();
    }
}
