package ua.goit.Enterprise.Module2.Interfaces;

/**
 * Created by coura on 06.06.2016.
 * <p>
 * Переписать интерфейс Validator так что бы он был типизирован по принемаемому значению isValid(Object result);
 */
public interface Validator<T> {

    // Валидирует переданое значение
    boolean isValid(T result);
}
