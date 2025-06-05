package SemanticErros;

public abstract class SemanticError {
    protected String message;
    protected int line;
    protected int column;

    public SemanticError(String message, int line, int column) {
        this.message = message;
        this.line = line;
        this.column = column;
    }

    public abstract String getErrorType();

    @Override
    public String toString() {
        return String.format("[%s] Line %d:%d - %s", getErrorType(), line, column, message);
    }
}
