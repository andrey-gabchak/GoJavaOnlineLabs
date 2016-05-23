package ua.goit.Practice5.Task1;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 23.05.2016.
 */
public class KmpSmallestPeriodTest {

    private static KmpSmallestPeriod kmpSmallestPeriod;

    @BeforeClass
    public static void setUp() throws Exception {
        kmpSmallestPeriod = new KmpSmallestPeriod();

    }

    @Test
    public void testFindSmalletstPeriodForABC() throws Exception {
        String input = "abcabcabcabc";
        String expected = "abc";
        String result = kmpSmallestPeriod.findSmalletstPeriod(input);

        assertEquals(expected, result);
    }

    @Test
    public void testFindSmalletstPeriodForWrongString() throws Exception {
        String input = "abcabcabcabc666";
        String expected = "abc";
        String result = kmpSmallestPeriod.findSmalletstPeriod(input);

        assertNotEquals(expected, result);
    }
}