package ua.goit.Enterprise.Module2.ImplementationOfInterfaces;

import ua.goit.Enterprise.Module2.Interfaces.Validator;

/**
 * Created by coura on 06.06.2016.
 *
 * Validation by Number class.
 */
public class NumberValidator implements Validator<Number> {

    // Валидирует переданое значение
    public boolean isValid(Number result) {
        return (result != null);
    }
}
