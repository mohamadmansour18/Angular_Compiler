package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ConstructorStatement extends Node implements Stetment{
    private ConstructorParamListNode params; // اختياري
    private BlockNode block;                 // إجباري

    public ConstructorParamListNode getParams() { return params; }
    public void setParams(ConstructorParamListNode params) { this.params = params; }

    public BlockNode getBlock() { return block; }
    public void setBlock(BlockNode block) { this.block = block; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("constructor(");
        if (params != null) sb.append(params.getValue());
        sb.append(") ");
        sb.append(block != null ? block.getValue() : "{}");
        return sb.toString();
    }
}
