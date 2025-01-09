package ma.dentalim.exceptions;

import lombok.Getter;

@Getter
public class ValidationException extends RuntimeException {
    private final String field;
    private final Object rejectedValue;

    public ValidationException(String field, Object rejectedValue, String message) {
        super(String.format("Erreur de validation pour le champ '%s' : %s (Valeur rejetée : %s)", field, message, rejectedValue));
        this.field = field;
        this.rejectedValue = rejectedValue;
    }
}
