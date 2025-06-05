package SemanticErros;

public class DirectiveUsageError extends SemanticError {
    private String directiveName;

    public DirectiveUsageError(String directiveName, int line, int column) {
        super("Structural directive '" + directiveName + "' used on an invalid element.", line, column);
        this.directiveName = directiveName;
    }

    public String getDirectiveName() {
        return directiveName;
    }

    @Override
    public String getErrorType() {
        return "Directive Usage";
    }}
