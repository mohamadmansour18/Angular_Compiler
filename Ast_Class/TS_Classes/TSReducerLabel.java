package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TSReducerLabel extends Node implements TsSectionNode {
    private String name;
    private ReducerConfig config;

    public String getName() {
        return name;
    }

    public ReducerConfig getConfig() {
        return config;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfig(ReducerConfig config) {
        this.config = config;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "export const " + name + " = createReducer(" + config.getValue() + ");";
    }
}
