package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ComponentStatement1 extends Node implements Stetment{
    private ComponentOptionsNode options; // سنعرّفها عندما ترسل قاعدة componentOptions

    public ComponentOptionsNode getOptions() {
        return options;
    }

    public void setOptions(ComponentOptionsNode options) {
        this.options = options;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("@Component(");
        sb.append("{");
        if (options != null) {
            sb.append(options.getValue());
        }
        sb.append("}");
        sb.append(")");
        return sb.toString();
    }
}
