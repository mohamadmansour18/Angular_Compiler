package SymbolTable;

public class Symbol {

    private String name;
    private String type;
    private Scope scope;

    public Symbol(String name , String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

   public void print (){
        System.out.print(" | " + "Symbol :  " + this.getName() + " | ");
        System.out.print("Symbol Type: " + this.getType() + " | ");
        System.out.print("Scope Number of Symbol: " + this.getScope().getId() + " | ");
        System.out.print("Scope Name: " + this.getScope().getName() + " | ");
    }
}
