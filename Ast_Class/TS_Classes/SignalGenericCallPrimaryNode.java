package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class SignalGenericCallPrimaryNode extends Node {
    private Node genericArgs;   // من قاعدة signalGenericArgs
    private Node argumentList;  // من قاعدة argumentList (اختياري)

    public Node getGenericArgs() { return genericArgs; }
    public void setGenericArgs(Node genericArgs) { this.genericArgs = genericArgs; }

    public Node getArgumentList() { return argumentList; }
    public void setArgumentList(Node argumentList) { this.argumentList = argumentList; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("signal<");
        if (genericArgs != null) sb.append(genericArgs.getValue());
        sb.append(">(");
        if (argumentList != null) sb.append(argumentList.getValue());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {

        ctx.requireSignal();

        // تنظيف بسيط لإزالة ';' إن جاءت من العقدة الفرعية بالخطأ
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        // الأنواع (genericArgs) تُهمل في JS
        String args = "";
        if (argumentList != null) {
            String a = argumentList.generate(ctx);
            args = clean.apply(a);
        }

        // نُولّد الاستدعاء المكافئ في الـ runtime: __rt.signal(<args>)
        return "__rt.signal(" + args + ")";
    }
}
