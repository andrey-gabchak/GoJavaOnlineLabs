package ua.goit.Practice2.Task6;

/**
 * Created by coura on 15.05.2016.
 * Дано число. Треба замінити i-й біт замінити на нуль.
 * Наприклад:
 * для числа 6 в бінарному вигляді 110,
 * замінивши 2-й біт на нуль отримаємо 100 тобто 4.
 * 1<= i <= 32
 */
public class SetZero {
    public int set(int num, int i) {
        String binary = Integer.toBinaryString(num);
        char[] bits = binary.toCharArray();

        if ((i >= 1) && (i <= bits.length)) {
            bits[bits.length - i] = '0';
        }

        if (num < 0) {
            bits[0] = '0';
            binary = String.valueOf(bits);
            return Integer.parseInt(binary, 2)*(-1)-2;
        }

        binary = String.valueOf(bits);
        return Integer.parseInt(binary, 2);
    }
}
