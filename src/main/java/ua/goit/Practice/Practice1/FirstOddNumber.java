package ua.goit.Practice.Practice1;

/**
 * Created by coura on 24.04.2016.
 * Find the first odd number and return it to the index.
 * If it's not, return -1
 */

public class FirstOddNumber {
    public int find(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) return i;
        }
        return -1;
    }
}
