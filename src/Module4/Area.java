package Module4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * class Area
 *
 * Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга.
 *
 * Created by coura on 07.03.2016.
 */

public class Area {

    public static void main(String[] args) throws Exception {
        System.out.println("Выберите площадь какой фигуры нужно расчитать:");
        System.out.println("Треугольник - введите 1");
        System.out.println("Прямоугольник - введите 2");
        System.out.println("Круг - введите 3");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sfigure = reader.readLine();

        int figure = Integer.parseInt(sfigure);

        // calculate the area of a triangle
        if (figure == 1) {
            System.out.print("Введите размер первой стороны треугольника: ");
            BufferedReader triangle = new BufferedReader(new InputStreamReader(System.in));
            String sSide1 = triangle.readLine();

            System.out.print("Введите размер второй стороны треугольника: ");
            String sSide2 = triangle.readLine();

            System.out.print("Введите размер третей стороны треугольника: ");
            String sSide3 = triangle.readLine();

            int side1 = Integer.parseInt(sSide1);
            int side2 = Integer.parseInt(sSide2);
            int side3 = Integer.parseInt(sSide3);

            int summSide1 = side1 + side2;
            int summSide2 = side1 + side3;
            int summSide3 = side2 + side3;

            if ((side1 > 0) && (side2 > 0) && (side3 > 0)) { // side of the triangle must be greater than zero, to calculate the area
                if ((summSide1 > side3) && (summSide2 > side2) && (summSide3 > side1)) {

                    double perimeter = (side1 + side2 + side3) / 2.0;

                    double area;
                    area = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));

                    System.out.println("Площадь треугольника равна: " + area);

                } else {

                    System.out.println("Треугольник с такими сторонами не существует!");
                }

            } else {

                System.out.println("Сторона должна быть больше нуля!");
            }

        } else if (figure == 2) { // calculate the area of a rectangle

            System.out.println("Введите размеры стороны прямоугольника: ");

            BufferedReader rectangle = new BufferedReader(new InputStreamReader(System.in));
            String sFirstSide = rectangle.readLine();
            String sSecondSide = rectangle.readLine();

            int firstside = Integer.parseInt(sFirstSide);
            int secondside = Integer.parseInt(sSecondSide);

            if ((firstside > 0) && (secondside > 0)) {
                int area = firstside * secondside;
                System.out.println("Площадь прямоугольника равна: " + area);
            } else {
                System.out.println("Сторона должна быть больше нуля!");
            }
        } else if (figure == 3) { // the area of a circle

            System.out.print("Введите радиус круга: ");

            BufferedReader circle = new BufferedReader(new InputStreamReader(System.in));
            String sradius = circle.readLine();

            int radius = Integer.parseInt(sradius);

            if (radius > 0) { // calculate the area of a circle the radius
                double area = Math.PI * Math.pow(radius, 2.0);
                System.out.println("Площадь круга равна: " + area);
            } else {
                System.out.println("Радиус круга должнен быть больше нуля!");
            }
        } else {

            System.out.println("Введено не корректное значение! Необходимо выбрать 1, 2 или 3.");
        }
    }
}
