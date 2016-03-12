package Meeting;

import java.util.Scanner;

/**
 * class CaesarCipher
 *
 * Написать программу шифрования вводимых символов String по шифру Цезаря.
 *
 * Created by coura on 12.03.2016.
 */

public class CaesarCipher {

    public static void main(String[] args) {

        System.out.println("Введите текст для шифрования: ");
        Scanner type = new Scanner(System.in);
        String inputText = type.next();
        char[] Array = inputText.toCharArray();


        // Вывод значений массива
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }

    }
}
