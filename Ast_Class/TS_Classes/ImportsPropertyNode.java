package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ImportsPropertyNode extends Node {
    private ArrayList<String> imports = new ArrayList<>();

    public ArrayList<String> getImports() {
        return imports;
    }

    public void setImports(ArrayList<String> imports) {
        this.imports = imports;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("imports: [");
        for (int i = 0; i < imports.size(); i++) {
            sb.append(imports.get(i));
            if (i < imports.size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
