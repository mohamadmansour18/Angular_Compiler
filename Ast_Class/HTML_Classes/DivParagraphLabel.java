package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class DivParagraphLabel extends Node implements DivContentNode {

    private ArrayList<ParagraphAttribute> attributes = new ArrayList<>();
    private ParagraphContentNode content;

    public ArrayList<ParagraphAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<ParagraphAttribute> attributes) {
        this.attributes = attributes;
    }

    public ParagraphContentNode getContent() {
        return content;
    }

    public void setContent(ParagraphContentNode content) {
        this.content = content;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p");
        for (ParagraphAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(">");
        if (content != null) {
            sb.append(content.getValue());
        }
        sb.append("</p>");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // تنظيف: إزالة ';' النهائية إن ظهرت من عقد فرعية بالخطأ
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        StringBuilder sb = new StringBuilder();
        sb.append("<p");

        if (attributes != null && !attributes.isEmpty()) {
            java.util.List<String> attrs = new java.util.ArrayList<>();
            for (ParagraphAttribute a : attributes) {
                if (a == null) continue;
                String v = clean.apply(a.generate(ctx));
                if (!v.isEmpty()) attrs.add(v);
            }
            if (!attrs.isEmpty()) {
                sb.append(" ").append(String.join(" ", attrs));
            }
        }

        String inner = (content != null) ? clean.apply(content.generate(ctx)) : "";
        if (inner.isEmpty()) {
            sb.append("></p>");
            return sb.toString();
        }

        if (inner.indexOf('\n') >= 0) {
            sb.append(">\n");
            sb.append("  ").append(inner.replace("\n", "\n  ")).append("\n");
            sb.append("</p>");
        } else {
            sb.append(">").append(inner).append("</p>");
        }

        return sb.toString();
    }
}
