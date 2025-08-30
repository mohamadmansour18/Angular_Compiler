package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ImportStatement1 extends Node implements Stetment {
    private String importedName;   // الاسم داخل الأقواس { name }
    private String moduleLiteral;  // النص بين علامات التنصيص: "module/path"

    public String getImportedName() {
        return importedName;
    }

    public void setImportedName(String importedName) {
        this.importedName = importedName;
    }

    public String getModuleLiteral() {
        return moduleLiteral;
    }

    public void setModuleLiteral(String moduleLiteral) {
        this.moduleLiteral = moduleLiteral;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("import { ");
        if (importedName != null) {
            sb.append(importedName);
        }
        sb.append(" } from ");
        if (moduleLiteral != null) {
            sb.append(moduleLiteral); // يتضمن علامات التنصيص كما أتت من التوكن STRING
        }
        return sb.toString();
    }
}
