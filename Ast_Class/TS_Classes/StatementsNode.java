package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class StatementsNode extends Node {
    private Stetment statement;
    private boolean hasSemicolon;

    public Stetment getStatement() {
        return statement;
    }

    public void setStatement(Stetment statement) {
        this.statement = statement;
    }

    public boolean isHasSemicolon() {
        return hasSemicolon;
    }

    public void setHasSemicolon(boolean hasSemicolon) {
        this.hasSemicolon = hasSemicolon;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();

        if (statement != null) {
            sb.append(statement.getValue());
        }

        if (hasSemicolon) {
            sb.append(";");
        }

        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // 1) لو ما في عبارة داخليًا
        if (statement == null) return "";

        // 2) ولّد كود العبارة الداخلية
        String code = statement.generate(ctx);
        if (code == null) return "";
        String trimmed = code.trim();
        if (trimmed.isEmpty()) return "";

        // 3) لا نضيف ; إذا كان الكود أصلاً منتهٍ بـ ;
        if (trimmed.endsWith(";")) {
            return trimmed;
        }

        // 4) لا نضيف ; بعد تراكيب التحكم/البلوكات/تعريفات الدوال/الكلاسات
        //    لأن وجود ; بعدها قد يخلق "empty statement" غير مرغوب.
        //    (هذه هي أكثر الحالات شيوعًا؛ لو عندك أنواع أخرى أضفها هنا)
        boolean isBlockOrControl =
                trimmed.startsWith("{") ||
                        trimmed.startsWith("if ") || trimmed.startsWith("if(") ||
                        trimmed.startsWith("while ") || trimmed.startsWith("while(") ||
                        trimmed.startsWith("for ") || trimmed.startsWith("for(") ||
                        trimmed.startsWith("switch ") || trimmed.startsWith("switch(") ||
                        trimmed.startsWith("try ") || trimmed.startsWith("try{") ||
                        trimmed.startsWith("function ") ||
                        trimmed.startsWith("class ");

        if (isBlockOrControl) {
            // نُعيد النص كما هو بدون إضافة ;
            return trimmed;
        }

        return trimmed + (";");
    }
}
