package ua.goit.Module5;

import java.util.Scanner;

/**
 * class TypeArrayElements
 *
 * Ability to define size of the array, and then enter the elements of the array.
 * The number of elements in the array should not be limited.
 * Bonus task
 *
 * Created by coura on 11.03.2016.
 */
public class TypeArrayElemets {

    public static void main(String[] args) {
        Scanner sSize = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sSize.nextInt();

        int[] intArray = new int[size];

        for (int i = 0; i < intArray.length; i++) {

            Scanner arrayElemets = new Scanner(System.in);
            System.out.print("Enter the array element number " + (i + 1) + " : ");
            intArray[i] = arrayElemets.nextInt();
        }

        for (int element : intArray) {
            System.out.println(element);
        }
    }
}
