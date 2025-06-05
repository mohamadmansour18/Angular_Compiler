package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class RootProgram extends Node {
    public ArrayList<Program> programs=new ArrayList<>();

    public ArrayList<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<Program> programs) {
        this.programs = programs;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if(programs!=null)
        {
            for (Program p : programs)
            {
                p.accept(ast_Visitor);
            }
        }
    }
}
