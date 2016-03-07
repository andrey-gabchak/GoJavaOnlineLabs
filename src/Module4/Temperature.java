package Module4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * class Temperature
 *
 * Создать класс преобразующий значение температуры по шкале Цельсия
 * в значение по шкале Фаренгейта и в обратном направлении.
 *
 * Created by coura on 07.03.2016.
 */
public class Temperature {

    public static void main(String[] args) throws IOException {

        System.out.println("Если вы хотите перевести градусы Цельсия в Фаренгейты введите \"c\".");
        System.out.println("Если вы хотите перевести Фаренгейты в градусы Цельсия введите \"f\".");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String degrees = reader.readLine();
        String stemperature = reader.readLine();

        int temperature = Integer.parseInt(stemperature);

        if (degrees.equals("c")) {

            double fahrenheit = (temperature * 1.8) + 32;
            System.out.println(temperature + "\'C это " + fahrenheit + "\'F");

        } else if (degrees.equals("f")) {

            double celsius = (temperature - 32) / 1.8;
            System.out.println(temperature + "\'F это " + celsius + "\'C");
        } else {
            System.out.println("Не корректный ввод.");
        }
    }
}
