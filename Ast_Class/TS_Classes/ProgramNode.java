package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ProgramNode extends Node {
    private ArrayList<StatementsNode> statements = new ArrayList<>();

    public ArrayList<StatementsNode> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<StatementsNode> statements) {
        this.statements = statements;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();

        for (StatementsNode st : statements) {
            sb.append(st.getValue()).append("\n");
        }

        return sb.toString().trim();
    }

    @Override
    public String generate(GenContext ctx) {
        // نفتح نطاق منطقي جديد داخل السياق (لأسماء المتغيرات وإعادة التسمية... إلخ)
        ctx.pushScope();

        String body = this.statements.stream()
                // اطلب من كل Statement توليد جزئه من الكود
                .map(st -> st.generate(ctx))
                // تخلّص من null أو الأسطر الفارغة حتى لا نحصل على فراغات مزعجة
                .filter(code -> code != null && !code.trim().isEmpty())
                // اجمع النتائج كسطور متتابعة
                .collect(java.util.stream.Collectors.joining("\n"));

        ctx.popScope();
        return body;
    }
}
