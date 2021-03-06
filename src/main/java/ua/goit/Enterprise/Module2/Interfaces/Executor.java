package ua.goit.Enterprise.Module2.Interfaces;

import java.util.List;

/**
 * Created by coura on 06.06.2016.
 * <p>
 * Переписать интерфейс Executor так чтоб он был типизирован в соответсвии с с типизацией Task и Validator
 */
public interface Executor<T> {

    // Добавить таск на выполнение. Результат таска будет доступен через метод getValidResults().
    // Бросает Эксепшн если уже был вызван метод execute()
    void addTask(Task<T> task) throws Exception;

    // Добавить таск на выполнение и валидатор результата. Результат таска будет записан в ValidResults
    // если validator.isValid вернет true для этого результата
    // Результат таска будет записан в InvalidResults если validator.isValid вернет false для этого результата
    // Бросает Эксепшн если уже был вызван метод execute()
    void addTask(Task<? extends T> task, Validator<? super T> validator) throws Exception;

    // Выполнить все добавленые таски
    void execute() throws Exception;

    // Получить валидные результаты. Бросает Эксепшн если не был вызван метод execute()
    List<T> getValidResults() throws Exception;

    // Получить невалидные результаты. Бросает Эксепшн если не был вызван метод execute()
    List<T> getInvalidResults() throws Exception;
}
