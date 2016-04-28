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
        int startY = 0;
        int startX = 0;
        int index = 0;

        int[][] resultArray = new int[rows][columns];

        while (count != rows * columns - 1) {
            while (startX < columnsMinusOne) {
                resultArray[startY][startX] = count++;
                startX++;
            }
            while (startY < rowsMinusOne) {
                resultArray[startY][startX] = count++;
                startY++;
            }
            while (startX > index) {
                resultArray[startY][startX] = count++;
                startX--;
            }

            //Здесь уменьшаем количество шагов в каждом цикле по строкам, столбцам и по количеству проходимых клеток клеток
            rowsMinusOne--;
            columnsMinusOne--;
            index++;
            while (startY > index) {
                resultArray[startY][startX] = count++;
                startY--;
            }
        }
        //Вот условие добавления последнего элемента
        if (count == rows * columns - 1) {
            resultArray[startY][startX] = count++;
        }

        for (startY = 0; startY < rows; startY++) {
            for (startX = 0; startX < columns; startX++) {
                System.out.printf("%4d", resultArray[startY][startX]);
            }
            System.out.println();
        }


    }
}
