package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class AssignableNode extends Node {
    private String baseIdentifier;        // عندما يكون الأساس IDENTIFIER
    private Node baseExpr;                // عندما يكون الأساس (expr)
    private ArrayList<String> dotProps = new ArrayList<>();   // أسماء بعد '.'
    private ArrayList<Node> indexExprs = new ArrayList<>();   // تعبيرات داخل [...]
    private ArrayList<Character> order = new ArrayList<>();   // 'd' للنقطة، 'i' للفهرسة بالترتيب

    public String getBaseIdentifier() { return baseIdentifier; }
    public void setBaseIdentifier(String baseIdentifier) { this.baseIdentifier = baseIdentifier; }

    public Node getBaseExpr() { return baseExpr; }
    public void setBaseExpr(Node baseExpr) { this.baseExpr = baseExpr; }

    public ArrayList<String> getDotProps() { return dotProps; }
    public ArrayList<Node> getIndexExprs() { return indexExprs; }
    public ArrayList<Character> getOrder() { return order; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }


    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (baseIdentifier != null) {
            sb.append(baseIdentifier);
        } else if (baseExpr != null) {
            sb.append("(").append(baseExpr.getValue()).append(")");
        }

        int p = 0, q = 0;
        for (char k : order) {
            if (k == 'd') {
                sb.append(".").append(dotProps.get(p++));
            } else {
                sb.append("[").append(indexExprs.get(q++).getValue()).append("]");
            }
        }
        return sb.toString();
    }
}
