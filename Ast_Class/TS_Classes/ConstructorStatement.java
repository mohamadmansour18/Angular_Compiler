package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String generate(GenContext ctx) {
        // -------- 1) بناء وسائط الكونستركتور --------
        List<String> paramNames = new ArrayList<>();
        List<String> initLines  = new ArrayList<>();

        if (params != null && params.getParams() != null) {
            for (ConstructorParamNode p : params.getParams()) {
                String pname = (p.getName() != null && !p.getName().isEmpty()) ? p.getName() : "_";
                paramNames.add(pname);

                if (p.getAccessModifier() != null && !pname.equals("_")) {
                    initLines.add("this." + pname + " = " + pname + ";");
                }
            }
        }

        String paramsJs = String.join(", ", paramNames);

        // -------- 2) تحضير جسم الكونستركتور --------
        String userBody = "";
        if (block != null) {
            String blockJs = block.generate(ctx);
            if (blockJs != null) {
                String trimmed = blockJs.trim();
                if (trimmed.startsWith("{") && trimmed.endsWith("}")) {
                    userBody = trimmed.substring(1, trimmed.length() - 1).trim();
                } else {
                    userBody = trimmed;
                }
            }
        }
        // -------- 3) تجميع الناتج مع الإزاحة --------
        StringBuilder sb = new StringBuilder();
        sb.append("constructor(").append(paramsJs).append(") ").append("{\n");

        ctx.in();
        for (String line : initLines) {
            sb.append(ctx.ind()).append(line).append("\n");
        }

        if (!userBody.isEmpty()) {
            String[] lines = userBody.split("\\R");
            for (String line : lines) {
                if (line.isEmpty()) {
                    sb.append("\n");
                } else {
                    sb.append(ctx.ind()).append(line).append("\n");
                }
            }
        }
        ctx.out();
        sb.append("}");
        return sb.toString();
    }
}
