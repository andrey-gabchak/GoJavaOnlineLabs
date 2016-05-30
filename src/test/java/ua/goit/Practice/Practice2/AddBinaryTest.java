package ua.goit.Practice.Practice2;

import org.junit.Test;
import ua.goit.Practice.Practice2.Task7.AddBinary;

import static org.junit.Assert.*;

/**
 * Created by coura on 02.05.2016.
 */
public class AddBinaryTest {
    AddBinary addBinary = new AddBinary();

    @Test
    public void testAddLongNumber() throws Exception {
        String expected = "100000000000000000000000000000000";
        String result = addBinary.add("10000000000000000000000000000000" , "10000000000000000000000000000000");

        assertEquals(expected, result);
    }

    @Test
    public void testAddNull() throws Exception {
        String expected = "0";
        String result = addBinary.add("0" , "0");

        assertEquals(expected, result);
    }

    @Test
    public void testAddSmallNumber() throws Exception {
        String expected = "1001";
        String result = addBinary.add("101" , "100");

        assertEquals(expected, result);
    }

    @Test
    public void testAddSurplus() throws Exception {
        String expected = "100";
        String result = addBinary.add("1" , "11");

        assertEquals(expected, result);
    }

    @Test
    public void testAddSurplusLongNumber() throws Exception {
        String expected = "11111111111111111111111111111110";
        String result = addBinary.add("1111111111111111111111111111111" , "1111111111111111111111111111111");

        assertEquals(expected, result);
    }
}