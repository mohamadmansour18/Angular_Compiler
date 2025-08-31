package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class SelectorPropertyNode extends Node {
    // القيمة النصية كما جاءت من التوكن STRING (مع علامات التنصيص)
    private String selectorLiteral;

    public String getSelectorLiteral() {
        return selectorLiteral;
    }

    public void setSelectorLiteral(String selectorLiteral) {
        this.selectorLiteral = selectorLiteral;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        // نعيد النص بصيغة: selector: "..."
        StringBuilder sb = new StringBuilder();
        sb.append("selector: ");
        if (selectorLiteral != null) {
            sb.append(selectorLiteral); // تتضمن علامات التنصيص كما هي
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        String lit = (selectorLiteral != null) ? selectorLiteral : "''";
        return "selector: " + lit;
    }
}

