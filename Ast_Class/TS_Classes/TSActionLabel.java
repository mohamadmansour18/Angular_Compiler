package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TSActionLabel extends Node implements TsSectionNode {

    private String name;          // IDENTITY
    private ActionType actionType; // STRING

    public TSActionLabel(String name, ActionType actionType) {
        this.name = name;
        this.actionType = actionType;
    }

    public String getName() {
        return name;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "export const " + name + " = createAction(" + actionType.getValue() + ");";
    }

}
