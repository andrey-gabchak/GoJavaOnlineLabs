package ua.goit.Practice1;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 24.04.2016.
 */

public class MatrixTraversalTest {

    MatrixTraversal matrixTraversal = new MatrixTraversal();

    @Test
    public void testPrint() throws Exception {
        int[][] inputArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[] expectedArray = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};

        int[] resultArray = matrixTraversal.print(inputArray);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testPrint4x3() throws Exception {
        int[][] inputArray = {
                {1, 2, 3, 4,},
                {5, 6, 7, 8,},
                {9, 10, 11, 12,},
        };

        int[] expectedArray = {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};

        int[] resultArray = matrixTraversal.print(inputArray);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testPrint5x5() throws Exception {
        int[][] inputArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        int[] expectedArray = {1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12};

        int[] resultArray = matrixTraversal.print(inputArray);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testPrintEmptyArray() throws Exception {
        int[][] inputArray = {{}};

        int[] expectedArray = {};

        int[] resultArray = matrixTraversal.print(inputArray);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testPrintEmptyValueInArray() throws Exception {
        int[][] inputArray = {
                {1, 2, 3, 4,},
                {5, 6, 7, 8,},
                {9, 10, 11, 12,},
                {13, 14, 15, 16,}
        };

        int[] expectedArray = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};

        int[] resultArray = matrixTraversal.print(inputArray);

        assertArrayEquals(expectedArray, resultArray);
    }
}