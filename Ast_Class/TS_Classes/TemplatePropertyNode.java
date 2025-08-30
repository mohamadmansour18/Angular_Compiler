package Ast_Class.TS_Classes;

import Ast_Class.HTML_Classes.HtmlSectionNode;
import Ast_Class.Node.Node;
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
}
