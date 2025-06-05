package Ast_Class.Node;

import Main.Main;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import Visitor.AST_Visitor;

public class Node {
    private int childeCount;
    private int scopeID;

    public int getChildeCount() {
        return childeCount;
    }

    public void setChildeCount(int childeCount) {
        this.childeCount = childeCount;
    }

    public int getScopeID() {
        return scopeID;
    }

    public void setScopeID(int scopeID) {
        this.scopeID = scopeID;
    }

    public void createScope(String name) {
        Scope scope;

        if (Main.symbolTable.getScopeStack().isEmpty()) {
            scope = new Scope(null , name);
        } else {
            Scope parntScope1 = Main.symbolTable.getScopeStack().peek();
            scope = new Scope(parntScope1 , name);
        }

        Main.symbolTable.getScopeStack().push(scope);
        Main.symbolTable.getScopes().add(scope);
    }

    public  static void removeScope() {
        Main.symbolTable.getScopeStack().pop();

    }

    public  Scope getCurrentScope() {
        if (Main.symbolTable.getScopeStack().isEmpty())
            return null;

        return Main.symbolTable.getScopeStack().peek();
    }

    public void createSymbol(int ScopeId, String name, String type){
        Symbol symbol = new Symbol(name , type);;
        Scope scope = Main.symbolTable.getScopeByID(ScopeId);
        symbol.setScope(scope);
        scope.addSymbol(symbol);
    }

    public void accept(AST_Visitor ast_Visitor){

    }

    public String getValue() {
        return " ";
    }


}