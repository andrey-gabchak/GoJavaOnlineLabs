package ua.goit.Practice3.Task3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 16.05.2016.
 */
public class ReversePolishNotationTest {

    @Test
    public void testEvaluateMinus() throws Exception {
        ReversePolishNotation reversePolishNotationTest = new ReversePolishNotation();
        int expected = 15;

        int result = reversePolishNotationTest.evaluate("17 2 -");

        assertEquals(expected, result);
    }

    @Test
    public void testEvaluateDivide() throws Exception {
        ReversePolishNotation reversePolishNotationTest = new ReversePolishNotation();
        int expected = 11;

        int result = reversePolishNotationTest.evaluate("44 4 /");

        assertEquals(expected, result);
    }
}