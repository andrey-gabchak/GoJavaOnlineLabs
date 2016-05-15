package ua.goit.Practice2.Task4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by coura on 15.05.2016.
 * Дано рядок отриманий шляхом заміни цифр 0,1,2,...,9 певного числа на букви a,b,c,..,j.
 * Необхідно повернути початкове число маючи конвертований рядок.
 * Наприклад:
 * Для "bcd" повернути 123
 */

public class AbcNumber {
    public int convert(String num) {
        final List<Character> VALID_CHARS = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j');
        HashMap<Character, Integer> decodingMap = new HashMap<>();

        int i = 0;
        for (Character character : VALID_CHARS) {
            decodingMap.put(character, i);
            i++;
        }

        num = new StringBuilder(num).reverse().toString().toLowerCase();
        StringBuilder resultBuilder = new StringBuilder();

        for (int j = 0; j < num.length(); j++) {
            resultBuilder.append(decodingMap.get(num.charAt(j)));
        }

        int result = 0;
        try {
            result = Integer.parseInt(resultBuilder.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
