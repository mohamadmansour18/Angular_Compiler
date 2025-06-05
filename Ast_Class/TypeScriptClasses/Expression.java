package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Expression extends Node {
    private Logic logic;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if (logic!=null)
        {
            logic.accept(ast_Visitor);
        }
    }

    @Override
    public String getValue() {
        if (logic!=null)
            return logic.getValue();
    return " ";}

    public Logic getLogic() {
        return logic;
    }

    public void setLogic(Logic logic) {
        this.logic = logic;
    }
}
