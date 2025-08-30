package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ConstructorDeclarationNode extends Node {
    private Node paramList;   // سيصبح نوعًا أدق لاحقًا (مثلاً ConstructorParamListNode)
//    private BlockNode block;  // من قاعدة block

    public Node getParamList() {
        return paramList;
    }

    public void setParamList(Node paramList) {
        this.paramList = paramList;
    }

//    public BlockNode getBlock() {
//        return block;
//    }

//    public void setBlock(BlockNode block) {
//        this.block = block;
//    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

//    @Override
//    public String getValue() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("constructor(");
//        if (paramList != null) {
//            sb.append(paramList.getValue());
//        }
//        sb.append(") ");
//        if (block != null) {
//            sb.append(block.getValue());
//        } else {
//            sb.append("{}");
//        }
//        return sb.toString();
//    }
}
