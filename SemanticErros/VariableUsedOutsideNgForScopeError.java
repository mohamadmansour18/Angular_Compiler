package SemanticErros;

public class VariableUsedOutsideNgForScopeError extends SemanticError {
    private String variableName;

    public VariableUsedOutsideNgForScopeError(String variableName, int line, int column) {
        super("Variable '" + variableName + "' is used outside the scope of *ngFor.", line, column);
        this.variableName = variableName;
    }

    public String getVariableName() {
        return variableName;
    }

    @Override
    public String getErrorType() {
        return "Variable Outside *ngFor Scope";
    }
}