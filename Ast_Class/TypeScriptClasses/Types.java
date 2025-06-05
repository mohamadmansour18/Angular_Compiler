package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Types extends Node {
    private String name;
    private String typee;
    private String voidd;
    private String never;


    public String getNever() {
        return never;
    }

    public void setNever(String never) {
        this.never = never;
    }

    public String getVoidd() {
        return voidd;
    }

    public void setVoidd(String voidd) {
        this.voidd = voidd;
    }

    public String getTypee() {
        return typee;
    }

    public void setTypee(String typee) {
        this.typee = typee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectsType getType() {
        return type;
    }

    public void setType(ObjectsType type) {
        this.type = type;
    }

    private ObjectsType type;

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("**********************************************");
        System.out.println("Types Node");
        System.out.println("Child Count" + this.getChildeCount());
        if (typee != null) {
            System.out.println("type is : " + typee);
        }
        if (name != null) {
            System.out.println("type is: " + name);
        }
        if (voidd != null) {
            System.out.println("type is: " + voidd);
        }
        if (never != null) {
            System.out.println("type is: " + never);
        }
        if (type != null) {
            System.out.println("type is: object type");
            type.accept(astVisitor);
        }
        System.out.println("**********************************************");

    }

    StringBuilder s=new StringBuilder();
    @Override
    public String getValue() {
        if(name!=null)
        {
            s.append(name);
        }
        if(typee!=null)
        {
            s.append(typee);
        }
        if(voidd!=null)
        {
            s.append(voidd);
        }
        if(never!=null)
        {
            s.append(never);
        }
        if(type!=null){
            s.append(type.getValue());
        }
        return s.toString();
    }
}
