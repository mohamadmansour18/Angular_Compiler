package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class ImportStatement extends Statment{
    private ImportRule importRul;

    public ImportRule getImportRul() {
        return importRul;
    }

    public void setImportRul(ImportRule importRul) {
        this.importRul = importRul;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
