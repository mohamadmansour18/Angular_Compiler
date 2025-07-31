package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TSComponentLabel extends Node implements TsSectionNode {

    private ComponentBody body;  // محتوى @Component({})
    private String name;         // اسم الكلاس مثل TestComponent
    private ClassBlock classBlock;  // جسم الكلاس

    public TSComponentLabel(ComponentBody body, String name, ClassBlock classBlock) {
        this.body = body;
        this.name = name;
        this.classBlock = classBlock;
    }

    public ComponentBody getBody() {
        return body;
    }

    public void setBody(ComponentBody body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassBlock getClassBlock() {
        return classBlock;
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
        return body.getValue() + "\nexport class " + name + " " + classBlock.getValue();
    }
}
