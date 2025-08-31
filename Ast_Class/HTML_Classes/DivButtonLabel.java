package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;
import java.util.ArrayList;

public class DivButtonLabel extends Node implements DivContentNode {

    // يمثل خصائص الزر مثل type, click, disabled, إلخ
    private ArrayList<ButtonAttribute> attributes = new ArrayList<>();

    // يمثل محتوى الزر (قد يكون نصاً داخل <button>...</button>)
    private ButtonContent content;

    public ArrayList<ButtonAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<ButtonAttribute> attributes) {
        this.attributes = attributes;
    }

    public ButtonContent getContent() {
        return content;
    }

    public void setContent(ButtonContent content) {
        this.content = content;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("<button");
        for (ButtonAttribute attr : attributes) {
            sb.append(" ").append(attr.getValue());
        }
        sb.append(">");
        if (content != null) {
            sb.append(content.getValue());
        }
        sb.append("</button>");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        // تنظيف: إزالة ';' النهائية إن وُجدت
        java.util.function.Function<String, String> clean = s -> {
            if (s == null) return "";
            s = s.trim();
            if (s.endsWith(";")) s = s.substring(0, s.length() - 1).trim();
            return s;
        };

        StringBuilder sb = new StringBuilder();
        sb.append("<button");

        if (attributes != null && !attributes.isEmpty()) {
            java.util.List<String> attrs = new java.util.ArrayList<>();
            for (ButtonAttribute a : attributes) {
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
            sb.append("></button>");
            return sb.toString();
        }

        if (inner.indexOf('\n') >= 0) {
            sb.append(">\n");
            sb.append("  ").append(inner.replace("\n", "\n  ")).append("\n");
            sb.append("</button>");
        } else {
            sb.append(">").append(inner).append("</button>");
        }

        return sb.toString();
    }
}
