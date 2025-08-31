package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ParamNode extends Node {
    private String accessModifier; // اختياري
    private String name;           // اسم المعامل (إلزامي)
    private String typeName;       // اختياري: IDENTIFIER أو TYPE

    public String getAccessModifier() { return accessModifier; }
    public void setAccessModifier(String accessModifier) { this.accessModifier = accessModifier; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTypeName() { return typeName; }
    public void setTypeName(String typeName) { this.typeName = typeName; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (accessModifier != null) sb.append(accessModifier).append(" ");
        if (name != null) sb.append(name);
        if (typeName != null) sb.append(": ").append(typeName);
        return sb.toString();
    }
}
