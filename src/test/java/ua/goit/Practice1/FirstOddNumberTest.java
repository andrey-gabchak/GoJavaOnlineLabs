package ua.goit.Practice1;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 24.04.2016.
 */
public class FirstOddNumberTest {
    private static FirstOddNumber firstOddNumber;

    @BeforeClass
    public static void setUpClass() throws Exception {
        firstOddNumber = new FirstOddNumber();

    }

    @Test
    public void testFind() throws Exception {
        int[] input = {2, 4, 1, 3, 6, 7};
        int expected = 2;
        int result = firstOddNumber.find(input);

        assertEquals(expected, result);
    }

    @Test
    public void testFindAllEven() throws Exception {
        int[] input = {2, 4, 0, 8, 6, 10};
        int expected = -1;
        int result = firstOddNumber.find(input);

        assertEquals(expected, result);
    }

}