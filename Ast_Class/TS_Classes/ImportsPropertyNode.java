package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
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

    @Override
    public String generate(GenContext ctx) {

        if (imports == null || imports.isEmpty()) {
            return "imports: []";
        }

        java.util.List<String> resolved = new java.util.ArrayList<>();
        for (String name : imports) {
            if (name == null || name.isBlank()) continue;
            resolved.add(ctx.resolve(name));
        }

        if (resolved.isEmpty()) {
            return "imports: []";
        }

        return "imports: [" + String.join(", ", resolved) + "]";
    }
}
