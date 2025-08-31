package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class DivNgIfLabel extends Node implements DivContentNode {

    // يحتفظ بشرط ngIf (مثلاً: "user.isLoggedIn")
    private String condition;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "*ngIf=\"" + condition + "\"";
    }

    @Override
    public String generate(GenContext ctx) {

        String cond = (condition == null) ? "" : condition.replace("\"", "&quot;");
        return "*ngIf=\"" + cond + "\"";
    }
}
