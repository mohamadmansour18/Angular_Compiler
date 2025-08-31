package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class FunctionStatement extends Node implements Stetment{
    private String name;
    private Node paramList;   // متوقع: ParamListNode
    private BlockNode block;  // من قاعدة block

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Node getParamList() { return paramList; }
    public void setParamList(Node paramList) { this.paramList = paramList; }

    public BlockNode getBlock() { return block; }
    public void setBlock(BlockNode block) { this.block = block; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (name != null) sb.append(name);
        sb.append("(");
        if (paramList != null) sb.append(paramList.getValue());
        sb.append(") ");
        if (block != null) sb.append(block.getValue()); else sb.append("{}");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {

        String fnName = (name != null && !name.isBlank()) ? name : "_fn";

        String paramsJs = "";
        if (paramList != null) {
            String p = paramList.generate(ctx);
            if (p != null) paramsJs = p.trim();
        }

        String bodyJs = (block != null) ? block.generate(ctx) : "{}";


        String trimmed = bodyJs.trim();
        if (!(trimmed.startsWith("{") && trimmed.endsWith("}"))) {
            bodyJs = "{\n" + ctx.ind() + trimmed + "\n}";
        }

        return fnName + "(" + paramsJs + ") " + bodyJs;
    }
}
