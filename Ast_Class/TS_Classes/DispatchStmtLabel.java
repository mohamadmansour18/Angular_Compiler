package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class DispatchStmtLabel extends Node implements StatementNode{
    private ActionCall action;

    public DispatchStmtLabel(ActionCall action) {
        this.action = action;
    }

    public ActionCall getAction() {
        return action;
    }

    public void setAction(ActionCall action) {
        this.action = action;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "this.store.dispatch(" + action.getValue() + ");";
    }
}
