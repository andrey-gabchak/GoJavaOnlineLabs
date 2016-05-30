package ua.goit.Practice.Practice2.Task3;

/**
 * Created by coura on 15.05.2016.
 * Знайти середнє значення двох цілих чисел.
 * Приклади:
 * average( 4, 6 ) = 5
 * average( -4, -7 ) = -5
 * average( -4, 7 ) = 1
 */
public class AverageNumber {
    public int average(int a, int b) {
        int mod = a % 2 + b % 2;
        int result = a / 2 + b / 2;
        return result + mod / 2;
    }
}
