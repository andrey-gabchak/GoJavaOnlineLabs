package ua.goit.Practice2.Task6;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 15.05.2016.
 */
public class SetZeroTest {

    SetZero setZero = new SetZero();

    @Test
    public void testSet() throws Exception {
        int expected = 0;
        int input = 1;
        int setBit = 1;

        int result = setZero.set(input, setBit);

        assertEquals(expected, result);
    }

    @Test
    public void testSetThree() throws Exception {
        int expected = 1;
        int input = 3;
        int setBit = 2;

        int result = setZero.set(input, setBit);

        assertEquals(expected, result);
    }

    @Test
    public void testSetTwo() throws Exception {
        int expected = 2;
        int input = 3;
        int setBit = 1;

        int result = setZero.set(input, setBit);

        assertEquals(expected, result);
    }

    @Test
    public void testSetLongNumber() throws Exception {
        int expected = 1019;
        int input = 1023;
        int setBit = 3;

        int result = setZero.set(input, setBit);

        assertEquals(expected, result);
    }

    @Test
    public void testSetFirstBit() throws Exception {
        int expected = 1022;
        int input = 1023;
        int setBit = 1;

        int result = setZero.set(input, setBit);

        assertEquals(expected, result);
    }

    @Test
    public void testSetMiddleNumber() throws Exception {
        int expected = 6;
        int input = 7;
        int setBit = 1;

        int result = setZero.set(input, setBit);

        assertEquals(expected, result);
    }
    @Test
    public void testSetNegativeNumber() throws Exception {
        int expected = -1073741825;
        int input = -1;
        int setBit = 31;

        int result = setZero.set(input, setBit);

        assertEquals(expected, result);
    }
}