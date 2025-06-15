package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ArrayLable extends Node implements Info {
    private ArrayList<BaseData> baseData = new ArrayList<>();

    public ArrayList<BaseData> getBaseData() {
        return baseData;
    }

    public void setBaseData(ArrayList<BaseData> baseData) {
        this.baseData = baseData;
    }

    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }

    StringBuilder s=new StringBuilder();
    String st="";
    @Override
    public String getValue() {
        if (baseData!=null)
        {
            st="[";
            for (int i=0;i<baseData.size();i++)
            {
                st+=baseData.get(i).getValue();
                if(baseData.size()-1!=i){
                    st+=",";}

            }
            st+="]";

        }
        return st;
    }
}
