package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class ImportStatement extends Statment{
    private ImportRule importRul;

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        if (importRul!=null)
            importRul.accept(astVisitor);
    }

    public ImportRule getImportRul() {
        return importRul;
    }

    public void setImportRul(ImportRule importRul) {
        this.importRul = importRul;
    }
}
