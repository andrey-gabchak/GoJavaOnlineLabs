package ua.goit.Core.Module9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by coura on 01.04.2016.
 *
 * Implement encryption text using Caesar's algorithm.
 * Encrypt and decrypt a text representation of a collection of objects from the DMZ from Module 3: OOP in Java
 */

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите текст для шифрования:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String openText = reader.readLine();

        System.out.println("Введите ключ:");
        int key = Integer.parseInt(reader.readLine());

        String encodeValue = CaesarCipher.encode(openText, key);
        System.out.println("\nШИФРОВАНИЕ ВВЕДЕННОЙ СТРОКИ");
        System.out.println(encodeValue);
        System.out.println("\nДИШИФРОВКА ВВЕДЕННОЙ СТРОКИ");
        System.out.println(CaesarCipher.decode(encodeValue, key));

        LinkedList<String> openList = new LinkedList<>();
        openList.add("Ramstein");
        openList.add("БумБокс");
        openList.add("PhotoSummer");
        openList.add("PhotoWinter");
        openList.add("Coursework");
        openList.add("JavaCodeConvention");

        System.out.println("\nКоллекция без шифровки:");
        for (String s : openList) {
            System.out.println(s);
        }

        System.out.println("\nШИФРОВАНИЕ КОЛЛЕКЦИИ");
        for (int i = 0; i < openList.size(); i++) {
            String tmpString = CaesarCipher.encode(openList.get(i), key);
            openList.set(i, tmpString);
        }

        for (String s : openList) {
            System.out.println(s);
        }

        System.out.println("\nДИШИФРОВКА КОЛЛЕКЦИИ");
        for (int i = 0; i < openList.size(); i++) {
            String tmpString = CaesarCipher.decode(openList.get(i), key);
            openList.set(i, tmpString);
        }

        for (String s : openList) {
            System.out.println(s);
        }

    }
}
