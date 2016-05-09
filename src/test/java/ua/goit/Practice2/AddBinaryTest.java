package ua.goit.Practice2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 02.05.2016.
 */
public class AddBinaryTest {

    @Test
    public void testAddLongNumber() throws Exception {
        AddBinary addBinary = new AddBinary();
        String expected = "10000000000000000000000000000000";
        String result = addBinary.add("10000000000000000000000000000000" , "10000000000000000000000000000000");

        assertEquals(expected, result);
    }
}