package Module5;

import java.util.Arrays;

/**
 * class MaxAndMinElements
 *
 * Create a class that implements the search for the maximum and minimum elements
 * in an array of integers (int []).
 *
 * Created by coura on 11.03.2016.
 */

public class MaxAndMinElements2 {

    public static void main(String[] args) {

        int[] intArray = {0, 1, 2, 4, 10, 6, 1};

        Arrays.sort(intArray);

        System.out.println("Min element = " + intArray[0]);
        System.out.println("Max element = " + intArray[intArray.length - 1]);
    }
}
