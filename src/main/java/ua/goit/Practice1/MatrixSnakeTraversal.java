package ua.goit.Practice1;

import java.util.ArrayList;

/**
 * Created by coura on 24.04.2016.
 * <p>
 * Walk through the matrix as a "snake" and return all the numbers in one-dimensional array.
 * Example:
 * Input
 * [[1, 2, 3],
 * [4, 5, 6],
 * [7, 8, 9]]
 * Output
 * [1, 4, 7, 8, 5, 2, 3, 6, 9]
 */
public class MatrixSnakeTraversal {

    public static void main(String[] args) {
        MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int[] integers = matrixSnakeTraversal.print(matrix);

        for (int integer : integers) {
            System.out.print(integer + " ");
        }
    }

    public int[] print(int[][] input) {
        int[] result = new int[input.length * input[0].length];

        int columns = input.length;
        int lines = input[0].length;

        int resultCount = 0;
        for (int y = 0; y < lines; y++) {
            if (y % 2 == 0) {
                for (int x = 0; x < columns; x++) {
                    result[resultCount] = input[x][y];
                    resultCount++;
                }
            } else {
                for (int x = columns - 1; x >= 0; x--) {
                    result[resultCount] = input[x][y];
                    resultCount++;
                }
            }
        }
        return result;
    }
}
