package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Logic extends Node {
    private ArrayList<LogicAnd> logicAnds=new ArrayList<>();

    public ArrayList<LogicAnd> getLogicAnds() {
        return logicAnds;
    }

    public void setLogicAnds(ArrayList<LogicAnd> logicAnds) {
        this.logicAnds = logicAnds;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    @Override
    public String getValue() {

            if (logicAnds!=null) {
                if (logicAnds.getFirst() != null) {
                    return logicAnds.getFirst().getValue();
                }
            }

            return " ";
    }


}
