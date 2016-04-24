package ua.goit.Practice1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 24.04.2016.
 */
public class SumDigitsTest {
    SumDigits sumDigits = new SumDigits();

    @Test
    public void testSum() throws Exception {
        int inputNumber = 1230;
        int expected = 6;

        int result = sumDigits.sum(inputNumber);

        assertEquals(expected, result);
    }

    @Test
    public void testSumNegativeNumber() throws Exception {
        int inputNumber = -256;
        int expected = 13;

        int result = sumDigits.sum(inputNumber);

        assertEquals(expected, result);
    }
}