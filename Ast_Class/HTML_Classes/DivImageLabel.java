package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class DivImageLabel extends Node implements DivContentNode {

    // يحتفظ بجميع الخصائص الخاصة بوسم <img>
    private ArrayList<ImgAttribute> attributes = new ArrayList<>();

    public ArrayList<ImgAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<ImgAttribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<img");
        for (ImgAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(" />");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        StringBuilder sb = new StringBuilder();
        sb.append("<img");

        if (attributes != null && !attributes.isEmpty()) {
            java.util.List<String> attrs = new java.util.ArrayList<>();
            for (ImgAttribute a : attributes) {
                if (a == null) continue;
                String v = clean.apply(a.generate(ctx));
                if (!v.isEmpty()) attrs.add(v);
            }
            if (!attrs.isEmpty()) {
                sb.append(" ").append(String.join(" ", attrs));
            }
        }

        sb.append(" />");
        return sb.toString();
    }
}
