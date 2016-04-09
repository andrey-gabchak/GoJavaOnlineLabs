package ua.goit.Module5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * class MaxAndMinElements
 *
 * Create a class that implements the search for the maximum and minimum elements
 * in an array of integers (int []).
 *
 * Created by coura on 11.03.2016.
 */

public class MaxAndMinElementsSort {

    public static void main(String[] args) {

        Scanner sSize = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sSize.nextInt();

        int[] intArray = new int[size];

        for (int i = 0; i < intArray.length; i++) {

            Scanner arrayElemets = new Scanner(System.in);
            System.out.print("Enter the array element number " + i + " : ");
            intArray[i] = arrayElemets.nextInt();
        }

        Arrays.sort(intArray);

        System.out.println("Min element = " + intArray[0]);
        System.out.println("Max element = " + intArray[intArray.length - 1]);
    }
}
