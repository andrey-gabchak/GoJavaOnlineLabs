package ua.goit.Practice1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 24.04.2016.
 */
public class MatrixSnakeTraversalTest {

    @Test
    public void testPrint() throws Exception {
        int[] expected = {1, 4, 7, 10, 11, 8, 5, 2, 3, 6, 9, 12};

        MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        int[] result = matrixSnakeTraversal.print(matrix);

        assertArrayEquals(expected, result);
    }
}