package ua.goit.Practice2;

import org.junit.Test;
import ua.goit.Practice2.Task2.PositiveAverageNumber;

import static org.junit.Assert.*;

/**
 * Created by coura on 02.05.2016.
 */
public class PositiveAverageNumberTest {

    @Test
    public void testAverage() throws Exception {
        PositiveAverageNumber positiveAverageNumber = new PositiveAverageNumber();
        int expected = 1073741824;
        int result = positiveAverageNumber.average(1073741825, 1073741823);

        assertEquals(expected, result);
    }
}