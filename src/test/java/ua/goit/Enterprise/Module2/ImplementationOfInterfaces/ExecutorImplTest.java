package ua.goit.Enterprise.Module2.ImplementationOfInterfaces;

import org.junit.BeforeClass;
import org.junit.Test;
import ua.goit.Enterprise.Module2.Interfaces.Task;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by coura on 06.06.2016.
 */
public class ExecutorImplTest {
    private static ExecutorImpl executor;
    private static List<Task<Long>> inputTaskList;
    private static List<Long> expectedList;

    @BeforeClass
    public static void setUp() throws Exception {
        executor = new ExecutorImpl();
        inputTaskList = Arrays.asList(
                new LongTask(10L),
                new LongTask(20L),
                new LongTask(30L)
        );
        for (Task<Long> longTask : inputTaskList) {
            executor.addTask(longTask);
        }
        expectedList = Arrays.asList(
                10L,
                20L,
                30L
        );
    }

    @Test
    public void testAddTask() throws Exception {
        List<LongTask> resultList = executor.getAllTasks();

        for (int i = 0; i < expectedList.size(); i++) {
            assertEquals(expectedList.get(i), resultList.get(i).getResult());
        }
    }

    @Test
    public void testAddTaskValidator() throws Exception {
        executor.execute();
        for (int i = 0; i < expectedList.size(); i++) {
            assertEquals(expectedList.get(i), executor.getValidResults().get(i));
        }

    }

    @Test
    public void testGetValidResults() throws Exception {
        executor.execute();

        List<Long> resultList = executor.getValidResults();
        for (int i = 0; i < expectedList.size(); i++) {
            assertEquals(expectedList.get(i), resultList.get(i));
        }
    }

    //Use generics we can't get invalid result because we can't give anything except Long
    @Test
    public void testGetInvalidResults() throws Exception {
    }
}