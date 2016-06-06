package ua.goit.Enterprise.Module2.ImplementationOfInterfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by coura on 06.06.2016.
 */
public class LongTaskTest {

    @Test
    public void testGetResult() throws Exception {
        LongTask longTask = new LongTask(10L);
        Long expected = 10L;
        Long result = longTask.getResult();
        assertEquals(expected, result);
    }
}