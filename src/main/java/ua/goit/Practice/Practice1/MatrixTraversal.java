package ua.goit.Practice.Practice1;

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
