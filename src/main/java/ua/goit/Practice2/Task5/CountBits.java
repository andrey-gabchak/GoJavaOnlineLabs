package ua.goit.Practice2.Task5;

/**
 * Created by coura on 15.05.2016.
 * Для даного числа порахувати кількість біт.
 * Наприклад:
 * Для числа 13 в бінарному вигляді 1101 повернути 3.
 */
public class CountBits {
    public int count(int num) {
        String binary = Integer.toBinaryString(num);
        int result = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }
}
