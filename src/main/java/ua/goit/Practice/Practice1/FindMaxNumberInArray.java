package ua.goit.Practice.Practice1;

/**
 * Created by coura on 24.04.2016.
 *
 * Find the maximum number in the array.
 * Guaranteed that the array is never empty.
 */
public class FindMaxNumberInArray {
    public int max(int[] input) {
        int maxNumber = input[0];
        for (int i = 0; i < input.length; i++) {
            if (maxNumber < input[i]) maxNumber = input[i];
        }
        return maxNumber;
    }
}
