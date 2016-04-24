package ua.goit.Practice1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 24.04.2016.
 */
public class MatrixTraversalTest {

    @Test
    public void testPrint() throws Exception {
        MatrixTraversal matrixTraversal = new MatrixTraversal();
        int[][] inputArray = {
                {1,   2,  3,  4},
                {5,   6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };
        int[] expectedArray = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};

        int[] resultArray = matrixTraversal.print(inputArray);

        assertArrayEquals(expectedArray, resultArray);
    }
}