package SemanticErros;

public class TemplateVariableError extends SemanticError {
    private String variableName;

    public TemplateVariableError(String variableName, int line, int column) {
        super("Template variable '" + variableName + "' is not declared in this scope.", line, column);
        this.variableName = variableName;
    }

    public String getVariableName() {
        return variableName;
    }

    @Override
    public String getErrorType() {
        return "Template Variable";
    }
}
