package ua.goit.Practice2;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by coura on 29.04.2016.
 * Дано 2 числа в системі числення з основою 36. Будь-яка цифра може бути в межах [0-9a-z].
 * Повернути суму чисел, також в системі 36.
 * Наприклад:
 * "9" + "1" = "a"
 * "z" + "1" = "10"
 */

public class AddNumberBase36 {
    public static void main(String[] args) {
        String str = "F2C22A3B6CA109A46D9B45DB3F2C578A";
        BigInteger num = new BigInteger(str, 36);
        System.out.println(""+num);
    }
    public String add(String a, String b) {
        return null;
    }
}
