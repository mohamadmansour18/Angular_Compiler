package SymbolTable;

import java.util.ArrayList;

public class Scope {

    private static int contID = 0;

    private int id ;
    private String name;
    private Scope parent ;
    private ArrayList<Symbol> symbolList = new ArrayList<>();


    public Scope(Scope parent , String name) {
        this.parent = parent;
        this.name = name ;
        this.id = ++contID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static int getContID() {
        return contID;
    }

    public static void setContID(int contID) {
        Scope.contID = contID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public ArrayList<Symbol> getSymbolList() {
        return symbolList;
    }

    public void addSymbol(Symbol symbol) {
        this.symbolList.add(symbol);
    }

    public Symbol searchForSymbol(String name) {
        for (Symbol search : symbolList) {
            if (search.getName().equalsIgnoreCase(name)) {
                return search;
            }
        }
        return null;
    }

}
