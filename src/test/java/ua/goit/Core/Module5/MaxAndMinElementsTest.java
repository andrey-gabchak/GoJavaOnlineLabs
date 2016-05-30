package ua.goit.Core.Module5;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by coura on 09.04.2016.
 *
 * Unit-tests for search minimum and maximum number in array.
 */

public class MaxAndMinElementsTest {

    private static MaxAndMinElements maxAndMinElements;
    @BeforeClass
    public static void setUpClass() throws Exception {
        maxAndMinElements = new MaxAndMinElements();

    }

    @Test
    public void testMinimum() throws Exception {
        int[] intArray = {25, 11, 34, 0, 15 , 27, -1};

        int result = maxAndMinElements.minimum(intArray);

        Assert.assertEquals(-1, result);
    }

    @Test
    public void testMaximum() throws Exception {
        int[] intArray = {25, 11, 34, 0, 15 , 27, -1};

        int result = maxAndMinElements.maximum(intArray);

        Assert.assertEquals(34, result);
    }
}