package ua.goit.Practice.Practice1;

/**
 * Created by coura on 24.04.2016.
 *
 * Calculate the sum of digits.
 * For example the sum of digits of 123 is equal to 6.
 */

public class SumDigits {
    public int sum(int number) {
        char[] numberToCharArray = String.valueOf(number).toCharArray();
        int result = 0;
        for (int i = 0; i < numberToCharArray.length; i++) {
            if (numberToCharArray[i] != '-') result = result + (numberToCharArray[i] - '0');
        }
        return result;
    }
}
