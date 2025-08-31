package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ObjectPropertyNode extends Node {
    private boolean spread;     // ...expr
    private String key;         // IDENTIFIER أو STRING (مع علاماتها)
    private boolean shorthand;  // IDENTIFIER فقط بدون قيمة
    private Node expression;    // قيمة الخاصية أو التعبير الممدود (...expr)

    public boolean isSpread() { return spread; }
    public void setSpread(boolean spread) { this.spread = spread; }

    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }

    public boolean isShorthand() { return shorthand; }
    public void setShorthand(boolean shorthand) { this.shorthand = shorthand; }

    public Node getExpression() { return expression; }
    public void setExpression(Node expression) { this.expression = expression; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        if (spread) {
            return "..." + (expression != null ? expression.getValue() : "");
        }
        if (shorthand) {
            return key;
        }
        return key + ": " + (expression != null ? expression.getValue() : "");
    }
}
