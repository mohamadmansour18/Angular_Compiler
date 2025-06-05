package Ast_Class.TypeScriptClasses;

import Visitor.AST_Visitor;

public class ObjectsLable  extends Info {
    private Objects objects;

    public Objects getObjects() {
        return objects;
    }

    public void setObjects(Objects objects) {
        this.objects = objects;
    }

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
        if(objects!=null) {
            objects.accept(ast_Visitor);
        }
    }
}
