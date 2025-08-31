package Ast_Class.HTML_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class DivNgForLabel extends Node implements DivContentNode {

    // يحتفظ بتعبير التكرار (مثل: "let x of list")
    private String loopExpression;


    public String getLoopExpression() {
        return loopExpression;
    }

    public void setLoopExpression(String loopExpression) {
        this.loopExpression = loopExpression;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "*ngFor=\"" + loopExpression + "\"";
    }

    @Override
    public String generate(GenContext ctx) {
        String expr = (loopExpression == null) ? "" : loopExpression.replace("\"", "&quot;");
        return "*ngFor=\"" + expr + "\"";
    }

}
