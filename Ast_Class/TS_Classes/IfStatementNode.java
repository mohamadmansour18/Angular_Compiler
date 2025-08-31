package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class IfStatementNode extends Node {
    private Node condition;   // expr
    private Node thenBranch;  // block | exprStatement | returnStatement
    private Node elseBranch;  // اختياري: block | exprStatement | returnStatement

    public Node getCondition() { return condition; }
    public void setCondition(Node condition) { this.condition = condition; }

    public Node getThenBranch() { return thenBranch; }
    public void setThenBranch(Node thenBranch) { this.thenBranch = thenBranch; }

    public Node getElseBranch() { return elseBranch; }
    public void setElseBranch(Node elseBranch) { this.elseBranch = elseBranch; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (");
        if (condition != null) sb.append(condition.getValue());
        sb.append(") ");
        if (thenBranch != null) sb.append(thenBranch.getValue());
        if (elseBranch != null) {
            sb.append(" else ");
            sb.append(elseBranch.getValue());
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // 1) الشرط
        String cond = (condition != null) ? condition.generate(ctx) : "false";
        if (cond == null) cond = "false";
        cond = cond.trim();

        // إزالة ';' إن وُجدت بالخطأ في ناتج تعبير الشرط
        if (cond.endsWith(";")) cond = cond.substring(0, cond.length() - 1).trim();

        // 2) تهيئة ناتج then/else كبلوكات سليمة
        String thenJs = formatAsBlock(thenBranch != null ? thenBranch.generate(ctx) : "", ctx);
        String elseJs = (elseBranch != null) ? formatAsBlock(elseBranch.generate(ctx), ctx) : null;

        // 3) البناء النهائي
        StringBuilder sb = new StringBuilder();
        sb.append("if (").append(cond).append(") ").append(thenJs);
        if (elseJs != null && !elseJs.isBlank()) {
            sb.append(" else ").append(elseJs);
        }
        return sb.toString();
    }


    private String formatAsBlock(String raw, GenContext ctx) {
        if (raw == null) raw = "";
        String trimmed = raw.trim();

        if (trimmed.startsWith("{") && trimmed.endsWith("}")) {
            return trimmed;
        }

        String inner = trimmed;
        if (!inner.isEmpty() && !inner.endsWith(";")) {
            inner = inner + ";";
        }

        StringBuilder b = new StringBuilder();
        b.append("{\n");
        ctx.in();
        String[] lines = inner.split("\\R");
        for (String line : lines) {
            if (line.isEmpty()) {
                b.append("\n");
            } else {
                b.append(ctx.ind()).append(line).append("\n");
            }
        }
        ctx.out();
        b.append(ctx.ind()).append("}");
        return b.toString();
    }

}
