package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class SignalGenericArgNode extends Node {
    private String baseType;   // IDENTIFIER | TYPE
    private int arrayDims;     // عدد [] المكرّرة

    public String getBaseType() { return baseType; }
    public void setBaseType(String baseType) { this.baseType = baseType; }

    public int getArrayDims() { return arrayDims; }
    public void setArrayDims(int arrayDims) { this.arrayDims = arrayDims; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        if (baseType != null) sb.append(baseType);
        for (int i = 0; i < arrayDims; i++) sb.append("[]");
        return sb.toString();
    }
}
