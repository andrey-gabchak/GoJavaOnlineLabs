package ua.goit.Practice4.Task2;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 23.05.2016.
 */
public class WordNumberTest {

    private static WordNumber wordNumber;

    @BeforeClass
    public static void setUp() throws Exception {
        wordNumber = new WordNumber();

    }

    @Test
    public void testCount() throws Exception {
        String input = "hi man";
        int expected = 2;
        int result = wordNumber.count(input);

        assertEquals(expected, result);
    }
}