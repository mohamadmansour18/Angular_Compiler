package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class HTMLDivLabel extends Node implements HtmlSectionNode {

    private ArrayList<DivAttribute> attributes = new ArrayList<>();

    private ArrayList<DivContentNode> content = new ArrayList<>();

    public ArrayList<DivAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<DivAttribute> attributes) {
        this.attributes = attributes;
    }

    public ArrayList<DivContentNode> getContent() {
        return content;
    }

    public void setContent(ArrayList<DivContentNode> content) {
        this.content = content;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div");

        for (DivAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }

        sb.append(">\n");

        for (DivContentNode child : content) {
            sb.append("  ").append(child.getValue()).append("\n");
        }

        sb.append("</div>");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // helper: إزالة ';' النهائية إن وُجدت
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        StringBuilder sb = new StringBuilder();

        // <div
        sb.append("<div");

        // خصائص div مفصولة بمسافة واحدة
        if (attributes != null && !attributes.isEmpty()) {
            java.util.List<String> attrs = new java.util.ArrayList<>();
            for (DivAttribute a : attributes) {
                if (a == null) continue;
                String v = clean.apply(a.generate(ctx));
                if (!v.isEmpty()) attrs.add(v);
            }
            if (!attrs.isEmpty()) {
                sb.append(" ").append(String.join(" ", attrs));
            }
        }

        // محتوى div
        if (content == null || content.isEmpty()) {
            // لا يوجد محتوى
            sb.append("></div>");
            return sb.toString();
        }

        sb.append(">\n");

        // أبناء div، كل عنصر في سطر مع مسافة بادئة بسيطة
        for (DivContentNode ch : content) {
            if (ch == null) continue;
            String line = clean.apply(ch.generate(ctx));
            if (!line.isEmpty()) {
                sb.append("  ").append(line).append("\n");
            } else {
                sb.append("\n");
            }
        }

        sb.append("</div>");
        return sb.toString();
    }
}