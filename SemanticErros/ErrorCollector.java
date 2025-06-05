package SemanticErros;

import java.util.ArrayList;
import java.util.List;

public class ErrorCollector {
    private List<SemanticError> errors = new ArrayList<>();

    public void addError(SemanticError error) {
        errors.add(error);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public void printErrors() {
        for (SemanticError error : errors) {
            System.err.println(error);
        }
    }

    public List<SemanticError> getErrors() {
        return errors;
    }
}