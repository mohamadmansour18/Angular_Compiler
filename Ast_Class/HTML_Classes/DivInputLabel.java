package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class DivInputLabel extends Node implements DivContentNode {

    // يمثل كافة الخصائص الموجودة في وسم <input>
    private ArrayList<InputAttribute> attributes = new ArrayList<>();

    public ArrayList<InputAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<InputAttribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<input");
        for (InputAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(" />");
        return sb.toString();
    }

    public String generate(GenContext ctx) {
        // تنظيف: إزالة ';' النهائية إن وُجدت من ناتج العقد الفرعية
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        StringBuilder sb = new StringBuilder();
        sb.append("<input");

        if (attributes != null && !attributes.isEmpty()) {
            java.util.List<String> parts = new java.util.ArrayList<>();
            for (InputAttribute a : attributes) {
                if (a == null) continue;
                String v = clean.apply(a.generate(ctx));
                if (!v.isEmpty()) parts.add(v);
            }
            if (!parts.isEmpty()) {
                sb.append(" ").append(String.join(" ", parts));
            }
        }

        sb.append(" />");
        return sb.toString();
    }
}
