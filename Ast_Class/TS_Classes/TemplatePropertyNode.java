package Ast_Class.TS_Classes;

import Ast_Class.HTML_Classes.HtmlSectionNode;
import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class TemplatePropertyNode extends Node {
    private ArrayList<HtmlSectionNode> sections = new ArrayList<>();

    public ArrayList<HtmlSectionNode> getSections() {
        return sections;
    }

    public void setSections(ArrayList<HtmlSectionNode> sections) {
        this.sections = sections;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        // نولّد الصيغة: template: ` ... `
        StringBuilder sb = new StringBuilder();
        sb.append("template: `\n");
        for (int i = 0; i < sections.size(); i++) {
            HtmlSectionNode sec = sections.get(i);
            sb.append(sec.getValue());
            if (i < sections.size()) sb.append("\n");
        }
        sb.append("`");
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {


        if (sections == null || sections.isEmpty()) {
            return "template: ``";
        }

        StringBuilder content = new StringBuilder();
        for (int i = 0; i < sections.size(); i++) {
            String part = sections.get(i) != null ? sections.get(i).generate(ctx) : "";
            if (part == null) part = "";
            part = part.replace("`", "\\`");
            content.append(part);
            if (i < sections.size() - 1) {
                content.append("\n");
            }
        }

        return "template: `\n" + content + "\n`";
    }
}
