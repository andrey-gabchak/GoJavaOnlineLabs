package ua.goit.Module11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by coura on 04.04.2016.
 */
public class Test {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();

            int i = Integer.parseInt(s);

            System.out.println(i);
        }
        catch (NumberFormatException exception) {
            System.out.println("Исключение" + exception);
        }
        catch (IOException e) {
            System.out.println("Исключение" + e);

        }

    }
}

