package ua.goit.Module5;

/**
 * class MaxAndMinElements
 *
 * Create a class that implements the search for the maximum and minimum elements
 * in an array of integers (int []).
 *
 * Created by coura on 11.03.2016.
 */

public class MaxAndMinElements {

    public static void main(String[] args) {

        int[] intArray = {0, 1, 2, 4, 10, 6, 1};

        System.out.println("Min element = " + minimum(intArray));
        System.out.println("Msx element = " + maximum(intArray));

    }

    static int minimum(int Array[]) {
        int minVariable = Array[0];

        for (int count = 0; count < (Array.length - 1); count++) {

            if (minVariable > Array[count + 1]) {
                minVariable = Array[count + 1];
            }
        }
        return minVariable;
    }

    static int maximum(int Array[]) {
        int maxVarible = Array[0];

        for (int count = 0; count < (Array.length - 1); count++) {

            if (maxVarible < Array[count + 1]) {
                maxVarible = Array[count + 1];
            }
        }
        return maxVarible;
    }
}