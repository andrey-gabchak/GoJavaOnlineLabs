package ua.goit.Practice1;

/**
 * Created by coura on 24.04.2016.
 *
 * Connect array of characters in a number.
 */
public class MergeNumbersFromCharArray {

    public int join(char[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            result = result * 10 + (input[i] - '0');
        }
        return result;
    }
}
