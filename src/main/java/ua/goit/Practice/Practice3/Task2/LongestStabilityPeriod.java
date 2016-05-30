package ua.goit.Practice.Practice3.Task2;

/**
 * Created by coura on 20.05.2016.
 * Дано масив чисел в якому знаходяться значення ВВП за кожен місяць в мільярдах доларів США.
 * Необхідно знайти найдовший період стабільності.
 * Період стабільності - період часу де всі значення ВВП попарно відрізняються один від одного максимум на 1.
 * Повернути кількість місяців.
 */

public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        int result = 0;

        if (gdp.length <= 1) {
            return gdp.length;
        }

        for (int i = 0; i < gdp.length; i++) {
            int minValue = gdp[i], maxValue = gdp[i];
            int j = i, sum = 0;

            if (result >= gdp.length - i) {
                return result;
            }

            while (j < gdp.length) {

                minValue = (minValue > gdp[j]) && (Math.abs(maxValue - gdp[j]) <= 1) ? gdp[j] : minValue;
                maxValue = (maxValue < gdp[j]) && (Math.abs(gdp[j] - minValue) <= 1) ? gdp[j] : maxValue;

                if ((minValue <= gdp[j]) && (gdp[j] <= maxValue)) {
                    sum++;
                } else {
                    result = result < sum ? sum : result;
                    break;
                }
                j++;
            }
        }
        return result;
    }
}
