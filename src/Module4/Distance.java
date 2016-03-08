package Module4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * class Distance
 *
 * Создать класс вычисляющий расстояние между двумя точками,
 * представленными координатами в двумерном пространстве (x1, y1), (x2, y2).
 *
 * Created by coura on 07.03.2016.
 */

public class Distance {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите координаты первой точки. Х1 = ");
        BufferedReader point = new BufferedReader(new InputStreamReader(System.in));

        String spointX1 = point.readLine();
        System.out.println("Y1 = ");
        String spointY1 = point.readLine();

        System.out.println("Введите координаты второй точки. Х2 = ");
        String spointX2 = point.readLine();
        System.out.println("Y2 = ");
        String spointY2 = point.readLine();

        int pointX1 = Integer.parseInt(spointX1);
        int pointX2 = Integer.parseInt(spointX2);
        int pointY1 = Integer.parseInt(spointY1);
        int pointY2 = Integer.parseInt(spointY2);

        double distance = Math.sqrt(Math.pow(pointX2 - pointX1, 2.0) + Math.pow(pointY2 - pointY1, 2.0));

        System.out.println("Расстояние между двумя точками: " + distance);
    }
}
