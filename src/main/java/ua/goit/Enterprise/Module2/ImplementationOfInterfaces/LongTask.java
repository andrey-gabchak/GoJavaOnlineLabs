package ua.goit.Enterprise.Module2.ImplementationOfInterfaces;

import ua.goit.Enterprise.Module2.Interfaces.Task;

/**
 * Created by coura on 06.06.2016.
 */
public class LongTask implements Task<Long> {
    private Long result;

    public LongTask(Long result) {
        this.result = result;
    }

    // Метода запускает таск на выполнение
    public void execute() {
        System.out.println(getResult());
    }

    // Возвращает результат выполнения
    public Long getResult() {
        return result;
    }
}
