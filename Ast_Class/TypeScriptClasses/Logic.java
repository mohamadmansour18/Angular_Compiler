package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class Logic extends Node {
    private ArrayList<LogicAnd> logicAnds=new ArrayList<>();

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if(logicAnds!=null)
        {
            for (LogicAnd l:logicAnds)
                l.accept(ast_Visitor);
        }
    }

    @Override
    public String getValue() {

            if (logicAnds!=null)
                if(logicAnds.getFirst()!=null)
                    return logicAnds.getFirst().getValue();
            return " ";
    }

    public ArrayList<LogicAnd> getLogicAnds() {
        return logicAnds;
    }

    public void setLogicAnds(ArrayList<LogicAnd> logicAnds) {
        this.logicAnds = logicAnds;
    }
}
