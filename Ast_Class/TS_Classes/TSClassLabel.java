package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TSClassLabel extends Node implements TsSectionNode{

    private String className;
    private String superClassName; // Nullable
    private ClassBlock classBlock;

    public String getClassName() {
        return className;
    }

    public String getSuperClassName() {
        return superClassName;
    }

    public ClassBlock getClassBlock() {
        return classBlock;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setSuperClassName(String superClassName) {
        this.superClassName = superClassName;
    }

    public void setClassBlock(ClassBlock classBlock) {
        this.classBlock = classBlock;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("export class ").append(className).append(" ");
        if (superClassName != null) {
            sb.append("extends ").append(superClassName).append(" ");
        }
        sb.append(classBlock.getValue());
        return sb.toString();
    }

}
