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

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public int[] print(int[][] input) {
        int resultArraySize = input.length * input[0].length;
        int[] resultArray = new int[resultArraySize];

        if (resultArraySize != 0) {

            int rows = input.length - 1;
            int columns = input[0].length - 1;

            int count = 0;
            int y = 0;
            int x = 0;
            int index = 0;


            while (count != resultArraySize - 1) {
                while (x < columns) {
                    resultArray[count] = input[y][x];
                    count++;
                    x++;
                }
                while (y < rows) {
                    resultArray[count] = input[y][x];
                    count++;
                    y++;
                }
                while (x > index) {
                    resultArray[count] = input[y][x];
                    count++;
                    x--;
                }

                rows--;
                columns--;
                index++;
                while (y > index) {
                    resultArray[count] = input[y][x];
                    count++;
                    y--;
                }
            }

            if (count == resultArraySize - 1) {
                resultArray[count] = input[y][x];
            }

        }
        return resultArray;
    }

    public int[] printSecondWay(int[][] input) {
        int[] result = new int[input.length * input[0].length];
        int sizeX = input[0].length-1;
        int sizeY = input.length-1;
        int startX = 0;
        int startY = 0;
        int count = 1;
        int index = 0;
        while (index < result.length){
            if (count == 1){
                for (int i = startX; i <= sizeX; i++) {
                    result[index] = input[startY][i];
                    index++;
                }
                startY++;
            }
            if (count == 2){
                for (int i = startY; i <= sizeY; i++) {
                    result[index] = input[i][sizeX];
                    index++;
                }
                sizeX--;
            }
            if (count == 3){
                for (int i = sizeX; i >= startX; i--) {
                    result[index] = input[sizeY][i];
                    index++;
                }
                sizeY--;
            }
            if (count ==4){
                for (int i = sizeY; i >= startY; i--) {
                    result[index] = input[i][startX];
                    index++;
                }
                startX++;
            }
            if (count < 4) count++;
            else count=1;
        }
        return result;

    }
}
