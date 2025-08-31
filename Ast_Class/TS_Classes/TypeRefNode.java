package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class TypeRefNode extends Node {
    private String base; // IDENTIFIER | TYPE | NULL
    private int arrayDims = 0; // عدد أبعاد المصفوفة []...
    private ArrayList<TypeRefNode> unionTypes = new ArrayList<>(); // بقية الأنواع بعد |

    public String getBase() { return base; }
    public void setBase(String base) { this.base = base; }

    public int getArrayDims() { return arrayDims; }
    public void setArrayDims(int arrayDims) { this.arrayDims = arrayDims; }

    public ArrayList<TypeRefNode> getUnionTypes() { return unionTypes; }
    public void setUnionTypes(ArrayList<TypeRefNode> unionTypes) { this.unionTypes = unionTypes; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();

        // الأساس
        if (base != null) sb.append(base);

        // أبعاد المصفوفة
        for (int i = 0; i < arrayDims; i++) {
            sb.append("[]");
        }

        // الاتحادات |
        for (int i = 0; i < unionTypes.size(); i++) {
            sb.append(" | ").append(unionTypes.get(i).getValue());
        }

        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {
        return " ";
    }
}
