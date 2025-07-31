package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class ReducerConfig extends Node {

    private String initialState;
    private ArrayList<OnReducerBlock> reducers;


    public String getInitialState() {
        return initialState;
    }

    public ArrayList<OnReducerBlock> getReducers() {
        return reducers;
    }

    public void setInitialState(String initialState) {
        this.initialState = initialState;
    }

    public void setReducers(ArrayList<OnReducerBlock> reducers) {
        this.reducers = reducers;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append(initialState);
        for (OnReducerBlock reducer : reducers) {
            sb.append(", ").append(reducer.getValue());
        }
        return sb.toString();
    }

}
