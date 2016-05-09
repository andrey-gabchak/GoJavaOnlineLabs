package ua.goit.Practice2;

/**
 * Created by coura on 02.05.2016.
 */
public class PositiveAverageNumber {
    public int average(int a, int b) {
        int result = 0;
        if (a == b) {
            result = a;
        } else {
            result = (a + b) / 2;
        }
        return result;
    }
}
