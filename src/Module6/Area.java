package Module6;

import java.util.Scanner;

/**
 * class Area
 *
 * Create a class that calculates the area of simple geometric figures: triangle, rectangle and circle.
 * Please add the code of existing classes of exception handling. In this case use an existing class.
 * Create your own exception class and write code for its generation and processing.
 *
 * Created by coura on 07.03.2016.
 */

public class Area {

    public static void main(String[] args) {
        System.out.println("Select the area of a shape necessary to calculate:");
        System.out.println("Triangle - type 1");
        System.out.println("Rectangle - enter 2");
        System.out.println("Circle - type 3");

        Scanner scanner = new Scanner(System.in);
        int figure = scanner.nextInt();

        // calculate the area of a triangle
        if (figure == 1) {
            System.out.print("Enter the first side of the triangle size: ");
            Scanner sSideFigure = new Scanner(System.in);
            int side1 = sSideFigure.nextInt();

            System.out.print("Enter the size of the second side of the triangle: ");
            int side2 = sSideFigure.nextInt();

            System.out.print("Enter the third side of the triangle size: ");
            int side3 = sSideFigure.nextInt();

            int summSide1 = side1 + side2;
            int summSide2 = side1 + side3;
            int summSide3 = side2 + side3;

            /**
             * В 6-ом модуле для исключений я использовал задачу
             * по нахождению площади фигурс 4-го модуля.
             * Соответственно код дублируется.
             * Варианты решения:
             * 1. Вынести находжение площади фигур в одтельные методы в /Module4/Area.class.
             * Вызывать методы в /Module6/Area.class, а не дублировать код.
             * 2. Вынести расчет площади фигур в одтельные классы.
             * Например, TriangleArea.class.
             * И вызывать классы при необходимости расчета фигуры.
             */

            if ((side1 > 0) && (side2 > 0) && (side3 > 0)) {
                if ((summSide1 > side3) && (summSide2 > side2) && (summSide3 > side1)) {

                    double perimeter = (side1 + side2 + side3) / 2.0;

                    double area;
                    area = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));

                    System.out.println("The area of a triangle is: " + area);

                } else {

                    System.out.println("Triangle with such parties does not exist!");
                }

            } else {

                System.out.println("Side should be greater than zero!");
            }

        } else if (figure == 2) { // calculate the area of a rectangle

            System.out.println("Enter the dimensions of the rectangle: ");

            Scanner rectangle = new Scanner(System.in);
            int firstside = rectangle.nextInt();
            int secondside = rectangle.nextInt();

            if ((firstside > 0) && (secondside > 0)) {
                int area = firstside * secondside;
                System.out.println("The area is: " + area);
            } else {
                System.out.println("Side should be greater than zero!");
            }
        } else if (figure == 3) { // the area of a circle

            System.out.print("Enter the radius of the circle: ");

            Scanner circle = new Scanner(System.in);
            int radius = circle.nextInt();

            if (radius > 0) { // calculate the area of a circle the radius
                double area = Math.PI * Math.pow(radius, 2.0);
                System.out.println("area of a circle is: " + area);
            } else {
                System.out.println("The radius must be greater than zero!");
            }
        } else {
            //custom exception
            try {
                throw new FigureExcepion(figure); //custom exception
            } catch (FigureExcepion e) {
                System.out.println("[Error]: Permission incorrect value! It is necessary to select 1, 2 or 3.");
            } catch (Exception e) { // Standard exception
                System.out.println("[Error]: Permission incorrect value! It is necessary to select 1, 2 or 3.");
            }
        }
    }
}
