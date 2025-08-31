package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ClassBodyNode extends Node {
    // نُخزّن الأعضاء كما هي عقد AST متنوّعة (حقول، دوال، ...).
    private ArrayList<Node> members = new ArrayList<>();

    public ArrayList<Node> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Node> members) {
        this.members = members;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < members.size(); i++) {
            Node m = members.get(i);
            sb.append(m.getValue());
            if (i < members.size() - 1) sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {

        // 1) ولّد كل عضو من أعضاء الكلاس
        java.util.List<String> parts = new java.util.ArrayList<>();
        for (Node m : members) {
            if (m == null) continue;
            String code = m.generate(ctx);
            if (code != null && !code.trim().isEmpty()) {
                parts.add(code.trim());
            }
        }

        // 2) اجمع الأعضاء بأسطر متتابعة بدون أقواس
        return String.join("\n", parts);
    }
}
