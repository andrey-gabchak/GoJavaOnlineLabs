package ua.goit.Practice1;

import java.util.Arrays;

/**
 * Created by coura on 24.04.2016.
 */
public class MatrixTraversal {

    public static void main(String[] args) {
        MatrixTraversal matrixTraversal = new MatrixTraversal();
        int[][] inputArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[] result = matrixTraversal.print(inputArray);

        for (int item : result) {
            System.out.print(item + " ");
        }
    }

    public int[] print(int[][] input) {

        if ((input.length > 1) && (input[0] != null)) {


            int rows = input.length;
            int columns = input[0].length;


            int rowsMinusOne = rows - 1;
            int columnsMinusOne = columns - 1;

            int count = 0;
            int y = 0;
            int x = 0;
            int p = 0;

            int[] resultArray = new int[rows * columns];

            while (count != rows * columns - 1) {
                while (x < columnsMinusOne) {
                    resultArray[count] = input[y][x];
                    count++;
                    x++;
                }
                while (y < rowsMinusOne) {
                    resultArray[count] = input[y][x];
                    count++;
                    y++;
                }
                while (x > p) {
                    resultArray[count] = input[y][x];
                    System.out.print(resultArray[count] + " ");
                    count++;
                    x--;
                }

                //Здесь уменьшаем количество шагов в каждом цикле по строкам, столбцам и по количеству проходимых клеток клеток
                rowsMinusOne--;
                columnsMinusOne--;
                p++;
                while (y > p) {
                    resultArray[count] = input[y][x];
                    count++;
                    y--;
                }
            }
            //Вот условие добавления последнего элемента
            if (count == rows * columns - 1) {
                resultArray[count] = input[y][x];
            }

            return resultArray;
        }
        int[] result = {};
        return result;
    }

}
