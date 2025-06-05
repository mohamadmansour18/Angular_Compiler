    package Ast_Class.TypeScriptClasses;

    import Visitor.AST_Visitor;

    public class ClassStatement extends Statment{
    private Class aClass;

        @Override
        public void accept(AST_Visitor astVisitor) {
            astVisitor.visit(this);
        }


    public Class getaClass() {
        return aClass;
    }


    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }
}
