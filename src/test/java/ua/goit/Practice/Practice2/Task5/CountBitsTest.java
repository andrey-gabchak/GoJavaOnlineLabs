package ua.goit.Practice.Practice2.Task5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 15.05.2016.
 */
public class CountBitsTest {

    @Test
    public void testCount() throws Exception {
        CountBits countBits = new CountBits();

        int expected = 3;

        int result = countBits.count(13);

        assertEquals(expected, result);
    }
}