package SemanticErros;
public class InvalidPropertyForElementError extends SemanticError {
    private String propertyName;
    private String elementType;

    public InvalidPropertyForElementError(String propertyName, String elementType, int line, int column) {
        super("Property '" + propertyName + "' is not valid for element type '" + elementType + "'.", line, column);
        this.propertyName = propertyName;
        this.elementType = elementType;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getElementType() {
        return elementType;
    }

    @Override
    public String getErrorType() {
        return "Invalid Property for Element";
    }
}
