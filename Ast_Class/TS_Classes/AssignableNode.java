package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class AssignableNode extends Node {
    private String baseIdentifier;        // عندما يكون الأساس IDENTIFIER
    private Node baseExpr;                // عندما يكون الأساس (expr)
    private ArrayList<String> dotProps = new ArrayList<>();   // أسماء بعد '.'
    private ArrayList<Node> indexExprs = new ArrayList<>();   // تعبيرات داخل [...]
    private ArrayList<Character> order = new ArrayList<>();   // 'd' للنقطة، 'i' للفهرسة بالترتيب

    public String getBaseIdentifier() { return baseIdentifier; }
    public void setBaseIdentifier(String baseIdentifier) { this.baseIdentifier = baseIdentifier; }

    public Node getBaseExpr() { return baseExpr; }
    public void setBaseExpr(Node baseExpr) { this.baseExpr = baseExpr; }

    public ArrayList<String> getDotProps() { return dotProps; }
    public ArrayList<Node> getIndexExprs() { return indexExprs; }
    public ArrayList<Character> getOrder() { return order; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }


    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (baseIdentifier != null) {
            sb.append(baseIdentifier);
        } else if (baseExpr != null) {
            sb.append("(").append(baseExpr.getValue()).append(")");
        }

        int p = 0, q = 0;
        for (char k : order) {
            if (k == 'd') {
                sb.append(".").append(dotProps.get(p++));
            } else {
                sb.append("[").append(indexExprs.get(q++).getValue()).append("]");
            }
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // دالة مساعدة لإزالة ';' النهائي إن وُجد بالخطأ
        java.util.function.Function<String, String> stripSemi = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        // 1) الأساس: إمّا معرف أو تعبير بين أقواس
        StringBuilder sb = new StringBuilder();
        if (baseIdentifier != null && !baseIdentifier.isBlank()) {
            // نمرّر الاسم عبر resolve لاحترام إعادة التسمية داخل السياق
            sb.append(ctx.resolve(baseIdentifier));
        } else if (baseExpr != null) {
            String inner = stripSemi.apply(baseExpr.generate(ctx));
            if (inner.isEmpty()) inner = "undefined";
            sb.append("(").append(inner).append(")");
        } else {
            // احتياط: لا يوجد أساس (حالة غير متوقعة)، نعيد نصًا فارغًا
            return "";
        }

        // 2) تطبيق سلاسل الوصول بالترتيب: '.' أو '[expr]'
        int p = 0; // مؤشر خصائص النقطة
        int q = 0; // مؤشر تعابير الفهرسة
        for (char k : order) {
            if (k == 'd') {
                // DOT (IDENTIFIER | SRC | TARGET)
                String prop = (p < dotProps.size()) ? dotProps.get(p++) : "";
                // بما أن التوكنات المسموحة هي معرفات صالحة، نستخدم صيغة dot.
                sb.append(".").append(prop);
            } else if (k == 'i') {
                // LBRACKET expr RBRACKET
                String idx = "";
                if (q < indexExprs.size()) {
                    idx = stripSemi.apply(indexExprs.get(q++).generate(ctx));
                }
                if (idx.isEmpty()) idx = "0"; // احتياط
                sb.append("[").append(idx).append("]");
            }
        }

        return sb.toString();
    }
}
