package ua.goit.Core.Module4;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by coura on 09.04.2016.
 *
 * Unit-tests for calculation area of figures.
 */
public class AreaTest {

    private static Area area;

    @BeforeClass
    public static void setUpClass() throws Exception {
        area = new Area();
    }


    //tests of triangle
    @Test
    public void testTriangleAreaPositiveNumbers() throws Exception {
        String side1 = "3";
        String side2 = "3";
        String side3 = "3";

        double result = area.triagleArea(side1, side2, side3);

        Assert.assertEquals(3.897, result, 0.001);
    }

    @Test
    public void testTriangleAreaNegativeNumbers() throws Exception {
        String side1 = "-3";
        String side2 = "-3";
        String side3 = "-3";

        double result = area.triagleArea(side1, side2, side3);

        Assert.assertEquals(0, result, 0.001);
    }

    @Test
    public void testTriangleAreaNotNumber() throws Exception {
        String side1 = "-3";
        String side2 = "a";
        String side3 = "-3";

        double result = area.triagleArea(side1, side2, side3);

        Assert.assertEquals(0, result, 0.001);
    }

    @Test
    public void testTriangleAreaNonexistent() throws Exception {
        String side1 = "1";
        String side2 = "1";
        String side3 = "3";

        double result = area.triagleArea(side1, side2, side3);

        Assert.assertEquals(0, result, 0.001);
    }

    //tests of rectangle
    @Test
    public void testRectangleAreaPositiveNumbers() throws Exception {
        String side1 = "3";
        String side2 = "3";

        int result = area.rectangleArea(side1, side2);

        assertEquals(9, result);
    }

    @Test
    public void testRectangleAreaNegativeNumbers() throws Exception {
        String side1 = "-3";
        String side2 = "3";

        int result = area.rectangleArea(side1, side2);

        assertEquals(0, result);
    }

    @Test
    public void testRectangleAreaNotNumbers() throws Exception {
        String side1 = "a";
        String side2 = "3";

        int result = area.rectangleArea(side1, side2);

        assertEquals(0, result);
    }

    //tests of circle
    @Test
    public void testCircleAreaPositiveNumbers() throws Exception {
        String radius = "3";

        double result = area.circleArea(radius);

        assertEquals(28.274, result, 0.001);
    }

    @Test
    public void testCircleAreaNegativeNumbers() throws Exception {
        String radius = "-3";

        double result = area.circleArea(radius);

        assertEquals(0, result, 0.001);
    }

    @Test
    public void testCircleAreaNotNumbers() throws Exception {
        String radius = "a";

        double result = area.circleArea(radius);

        assertEquals(0, result, 0.001);
    }

    @Test
    public void testCircleAreaNull() throws Exception {
        String radius = "0";

        double result = area.circleArea(radius);

        assertEquals(0, result, 0.001);
    }
}