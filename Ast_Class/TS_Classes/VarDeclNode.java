package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class VarDeclNode extends Node {
    private String name;             // ROUTES_ID | IDENTIFIER
    private String varKind;          // "const" أو "let" (نستنتجها من الأب varDeclareStatement)
    private String routesType;       // من ROUTES_TYPE (بديل ROUTES_ID)
    private Node typeAnnotation;     // من generalTypeAnnotation (بديل IDENTIFIER)
    private Node initializer;        // من assignmentExpr

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getVarKind() { return varKind; }
    public void setVarKind(String varKind) { this.varKind = varKind; }

    public String getRoutesType() { return routesType; }
    public void setRoutesType(String routesType) { this.routesType = routesType; }

    public Node getTypeAnnotation() { return typeAnnotation; }
    public void setTypeAnnotation(Node typeAnnotation) { this.typeAnnotation = typeAnnotation; }

    public Node getInitializer() { return initializer; }
    public void setInitializer(Node initializer) { this.initializer = initializer; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (name != null) sb.append(name);
        // النوع
        if (routesType != null) {
            sb.append(": ").append(routesType);
        } else if (typeAnnotation != null) {
            String t = typeAnnotation.getValue();
            if (t != null && !t.isEmpty()) {
                sb.append(": ").append(t);
            }
        }

        if (initializer != null) {
            sb.append(" = ").append(initializer.getValue());
        }
        return sb.toString();
    }
}
