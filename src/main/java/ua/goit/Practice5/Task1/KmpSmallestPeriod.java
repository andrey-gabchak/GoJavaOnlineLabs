package ua.goit.Practice5.Task1;

/**
 * Created by coura on 23.05.2016.
 *
 * A character string is said to have period k if it can be formed by concatenating one or more repetitions of another string of length k.
 For example, the string "abcabcabcabc" has period 3, since it is formed by 4 repetitions of the string "abc".
 It also has periods 6 (two repetitions of "abcabc") and 12 (one repetition of "abcabcabcabc").
 Write a program to read a character string and determine its smallest period
 Return (String) substring;
 */

public class KmpSmallestPeriod {
    public String findSmalletstPeriod(String input) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < input.length() - 1) {
            result.append(input.charAt(i));
            if (input.charAt(i + 1) == result.charAt(0)) {
                if (input.replaceAll(result.toString(), "").length() == 0)
                    return result.toString();
            }
            i++;
        }
        return null;
    }
}
