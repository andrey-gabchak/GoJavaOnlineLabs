package ua.goit.Practice.Practice1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 24.04.2016.
 */
public class FindMaxNumberInArrayTest {

    @Test
    public void testMax() throws Exception {
        int[] integers = {100, 1, -2, 4, 99};
        int expected = 100;
        FindMaxNumberInArray findMaxNumberInArray = new FindMaxNumberInArray();
        int result = findMaxNumberInArray.max(integers);

        assertEquals(expected, result);
    }
}