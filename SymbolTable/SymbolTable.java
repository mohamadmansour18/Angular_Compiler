package SymbolTable;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {

    private ArrayList<Scope> scopes = new ArrayList<Scope>();

    private Stack<Scope> scopeStack = new Stack<Scope>();


    public SymbolTable() {
    }

    public Scope getScopeByID(int id) {

        for (Scope scope : scopes) {
            if (scope.getId() == id) {
                return scope;
            }
        }

        return null;
    }


    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(ArrayList<Scope> scopes) {
        this.scopes = scopes;
    }

    public Stack<Scope> getScopeStack() {
        return scopeStack;
    }

    public void setScopeStack(Stack<Scope> scopeStack) {
        this.scopeStack = scopeStack;
    }


    public Symbol resolve(String name) {
        if (scopeStack.isEmpty()) return null;
        return scopeStack.peek().resolve(name);
    }

    public Scope searchForSymbol(String symbol) {
        for (Scope current : scopes) {
            if (current.searchForSymbol(symbol) != null)
                return current;
        }
        return null;
    }

    public void printAllSymbols() {
        for (Scope scope : scopes) {
            System.out.println("Scope #" + scope.getId() + " - " + scope.getName());
            for (Symbol sym : scope.getSymbolList()) {
                System.out.println("    " + sym.describe());
            }
        }
    }
}
