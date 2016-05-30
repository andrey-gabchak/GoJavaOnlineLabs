package ua.goit.Practice.Practice3.Task4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 21.05.2016.
 */
public class RectangleSquareTest {

    RectangleSquare rectangleSquare = new RectangleSquare();

    @Test
    public void testMeasureTwoFigure() throws Exception {
        int expected = 300;

        int[] x = {0, 0};
        int[] height = {20, 10};
        int[] weight = {10, 20};

        int result = rectangleSquare.measure(x, height, weight);

        assertEquals(expected, result);
    }

    @Test
    public void testMeasureThreeFigure() throws Exception {
        int expected = 39;

        int[] x = {1, 2, 4};
        int[] height = {3, 4, 5};
        int[] weight = {9, 6, 5};

        int result = rectangleSquare.measure(x, height, weight);

        assertEquals(expected, result);
    }
}