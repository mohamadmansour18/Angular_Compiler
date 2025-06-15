package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ObjectsLable  extends Node implements Info {
    private ArrayList<Object> object = new ArrayList<>();

    public ArrayList<Object> getObjects() {
        return object;
    }

    public void setObjects(ArrayList<Object> objects) {
        this.object = objects;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);

    }

    StringBuilder s = new StringBuilder();

    public String getValue() {
        s.append("{");
        if (object != null) {
            //System.err.println(object.size());
            for (int i = 0; i < object.size(); i++) {
                s.append(object.get(i).getValue());
                if (i != object.size() - 1)
                    s.append(",");
            }
        }
        s.append("}");
        return s.toString();
    }
}
