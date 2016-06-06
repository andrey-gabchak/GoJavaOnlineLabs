package ua.goit.Enterprise.Module2.Interfaces;

/**
 * Created by coura on 06.06.2016.
 *
 * Переписать интерфейс Task так что бы он был типизирован по результату (значению возращаемуому методом getResult()).
 */
public interface Task<T> {

    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    T getResult();
}
