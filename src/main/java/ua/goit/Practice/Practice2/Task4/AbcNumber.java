package ua.goit.Practice.Practice2.Task4;

/**
 * Created by coura on 15.05.2016.
 * Дано рядок отриманий шляхом заміни цифр 0,1,2,...,9 певного числа на букви a,b,c,..,j.
 * Необхідно повернути початкове число маючи конвертований рядок.
 * Наприклад:
 * Для "bcd" повернути 123
 */

public class AbcNumber {
    public int convert(String num) {
        String encode = "abcdefghij";
        StringBuilder decode = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            decode.append(encode.indexOf(num.charAt(i)));
        }

        int result = 0;
        try {
            result = Integer.parseInt(decode.toString());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
