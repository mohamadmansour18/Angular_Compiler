package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class OnReducerBlock extends Node {
    private String actionName;
    private Block block;

    public String getActionName() {
        return actionName;
    }

    public Block getBlock() {
        return block;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "on(" + actionName + ", state => " + block.getValue() + ")";
    }
}
