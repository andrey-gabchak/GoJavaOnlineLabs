package ua.goit.Practice3.Task4;

import org.junit.Test;
import ua.goit.Practice3.Task2.LongestStabilityPeriod;

import static org.junit.Assert.*;

/**
 * Created by coura on 20.05.2016.
 */
public class LongestStabilityPeriodTest {

    LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();

    @Test
    public void testCountOneElementInArray() throws Exception {
        int expected = 1;
        int[] inputArray = {1000};
        int result = longestStabilityPeriod.count(inputArray);
        assertEquals(expected, result);
    }

    @Test
    public void testCountFiveElementsInArray() throws Exception {
        int expected = 3;
        int[] inputArray = {1000, 1001, 1000, 998, 900};
        int result = longestStabilityPeriod.count(inputArray);
        assertEquals(expected, result);
    }
}