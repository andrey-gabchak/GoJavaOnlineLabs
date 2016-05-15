package ua.goit.Practice2.Task2;

/**
 * Created by coura on 02.05.2016.
 */
public class PositiveAverageNumber {
    public int average(int a, int b) {
        int mod = a % 2 + b % 2;
        int result = a / 2 + b / 2;
        return result + mod / 2;
    }
}
