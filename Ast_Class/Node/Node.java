package Ast_Class.Node;

import Code_Generation.GenContext;
import Main.Main;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import Visitor.AST_Visitor;
import org.antlr.v4.runtime.ParserRuleContext;

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
            Scope parentScope1 = Main.symbolTable.getScopeStack().peek();
            scope = new Scope(parentScope1 , name);
        }

        Main.symbolTable.getScopeStack().push(scope);
        Main.symbolTable.getScopes().add(scope);
    }

    public void removeScope() {
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


    public void initializeNode(ParserRuleContext ctx , boolean createScope , String scopeName) {
        if (createScope) {
            createScope(scopeName);
        }

        if (getCurrentScope() != null) {
            this.setScopeID(getCurrentScope().getId());
        } else {
            this.setScopeID(-1);
        }

        this.setChildeCount(ctx.getChildCount());
    }

    public void accept(AST_Visitor ast_Visitor){

    }

    public String getValue() {
        return " ";
    }

    public String generate(GenContext ctx) {
        return "";
    }
}