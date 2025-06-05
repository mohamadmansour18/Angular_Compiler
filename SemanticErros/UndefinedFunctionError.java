package SemanticErros;

public class UndefinedFunctionError extends SemanticError {
    private String functionName;

    public UndefinedFunctionError(String functionName, int line, int column) {
        super("Function '" + functionName + "' is not defined.", line, column);
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return functionName;
    }

    @Override
    public String getErrorType() {
        return "Undefined Function";
    }}
