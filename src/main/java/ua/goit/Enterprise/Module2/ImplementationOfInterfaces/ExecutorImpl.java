package ua.goit.Enterprise.Module2.ImplementationOfInterfaces;

import ua.goit.Enterprise.Module2.Interfaces.Executor;
import ua.goit.Enterprise.Module2.Interfaces.Task;
import ua.goit.Enterprise.Module2.Interfaces.Validator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coura on 06.06.2016.
 *
 */
public class ExecutorImpl<T> implements Executor<T> {
    private List<Task<T>> allTasks = new ArrayList<>();
    private List<T> validTasks = new ArrayList<>();
    private List<T> invalidTasks = new ArrayList<>();

    // Добавить таск на выполнение. Результат таска будет доступен через метод getValidResults().
    // Бросает Эксепшн если уже был вызван метод execute()
    @Override
    public void addTask(Task<T> task) throws Exception {
        allTasks.add(task);
    }

    // Добавить таск на выполнение и валидатор результата. Результат таска будет записан в ValidResults
    // если validator.isValid вернет true для этого результата
    // Результат таска будет записан в InvalidResults если validator.isValid вернет false для этого результата
    // Бросает Эксепшн если уже был вызван метод execute()
    @Override
    public void addTask(Task<? extends T> task, Validator<? super T> validator) throws Exception {
        if (validator.isValid(task.getResult())) {
            validTasks.add(task.getResult());
        } else {
            invalidTasks.add(task.getResult());
        }
    }

    // Выполнить все добавленые таски
    @Override
    public void execute() throws Exception {
        for (Task<T> task : allTasks) {
            addTask(task, new NumberValidator<T>());
        }
    }

    // Получить валидные результаты. Бросает Эксепшн если не был вызван метод execute()
    @Override
    public List<T> getValidResults() throws Exception {
        return validTasks;
    }

    // Получить невалидные результаты. Бросает Эксепшн если не был вызван метод execute()
    @Override
    public List<T> getInvalidResults() throws Exception {
        return invalidTasks;
    }

    //The method special for tests
    public List<Task<T>> getAllTasks() {
        return allTasks;
    }
}
