package ua.goit.Enterprise.Module2.ImplementationOfInterfaces;

import ua.goit.Enterprise.Module2.Interfaces.Validator;

/**
 * Created by coura on 06.06.2016.
 *
 * Validation by Number class.
 */
public class NumberValidator<T> implements Validator<T> {

    // Валидирует переданое значение
    public boolean isValid(T result) {
        return (result != null) && (result instanceof Number);
    }
}
