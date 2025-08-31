package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class RootProgram extends Node {
    private ArrayList<ProgramNode> programs = new ArrayList<>();

    public ArrayList<ProgramNode> getPrograms() {
        return programs;
    }

    public void setPrograms(ArrayList<ProgramNode> programs) {
        this.programs = programs;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();

        for (ProgramNode p : programs) {
            sb.append(p.getValue()).append("\n");
        }

        return sb.toString().trim();
    }

    @Override
    public String generate(GenContext ctx) {
        // أثناء التوليد، العقد الداخلية هي التي ستستدعي ctx.requireXxx()
        String body = programs.stream()
                .map(p -> p.generate(ctx))
                .filter(java.util.Objects::nonNull)
                .collect(java.util.stream.Collectors.joining("\n"));

        // في النهاية: نجمع الـ prelude (الوحدات المطلوبة فقط) + الجسم
        String prelude = ctx.getPrelude();
        return (prelude.isEmpty() ? "" : prelude + "\n\n") + body;
    }
}
