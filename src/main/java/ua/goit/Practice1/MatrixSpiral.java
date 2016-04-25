package ua.goit.Practice1;

/**
 * Created by coura on 25.04.2016.
  0   1   2   3   4   5
 15  16  17  18  19   6
 14  23  22  21  20   7
 13  12  11  10   9   8
 */

public class MatrixSpiral {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 6;

        int rowsMinusOne = rows - 1;
        int columnsMinusOne = columns - 1;

        int count = 0;
        int y = 0;
        int x = 0;
        int p = 0;

        int[][] resultArray = new int[rows][columns];

        while (count != rows * columns - 1) {
            while (x < columnsMinusOne) {
                resultArray[y][x] = count++;
                x++;
            }
            while (y < rowsMinusOne) {
                resultArray[y][x] = count++;
                y++;
            }
            while (x > p) {
                resultArray[y][x] = count++;
                x--;
            }

            //Здесь уменьшаем количество шагов в каждом цикле по строкам, столбцам и по количеству проходимых клеток клеток
            rowsMinusOne--;
            columnsMinusOne--;
            p++;
            while (y > p) {
                resultArray[y][x] = count++;
                y--;
            }
        }
        //Вот условие добавления последнего элемента
        if (count == rows * columns - 1) {
            resultArray[y][x] = count++;
        }

        for (y = 0; y < rows; y++) {
            for (x = 0; x < columns; x++) {
                System.out.printf("%4d", resultArray[y][x]);
            }
            System.out.println();
        }


    }
}
