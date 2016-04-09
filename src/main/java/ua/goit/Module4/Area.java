package ua.goit.Module4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * class Area
 *
 * Create a class that calculates the area of simple geometric figures: triangle, rectangle and circle.
 *
 * Created by coura on 07.03.2016.
 */

public class Area {

    public static void main(String[] args) throws Exception {
        System.out.println("Select the area of a shape necessary to calculate:");
        System.out.println("Triangle - type 1");
        System.out.println("Rectangle - enter 2");
        System.out.println("Circle - type 3");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int figure = Integer.parseInt(reader.readLine());

        // calculate the area of a triangle
        if (figure == 1) {
            double triangleResult = triagleArea();
            if (triangleResult > 0) System.out.println("The area of a triangle is: " + triangleResult);


        } else if (figure == 2) { // calculate the area of a rectangle
            int rectangleResult = rectangleArea();
            if (rectangleResult > 0) System.out.println("The area is: " + rectangleResult);


        } else if (figure == 3) { // the area of a circle
            double circleResult = circleArea();
            if (circleResult > 0) System.out.println("Area of the circle is: " + circleResult);

        } else {
            System.out.println("Permission incorrect value! It is necessary to select 1, 2 or 3.");
        }
    }

    public static boolean isPositiveInteger (String number){
        try {
            int tmpInteger = Integer.parseInt(number);
            return tmpInteger > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static double triagleArea() throws IOException {
        System.out.print("Enter the first side of the triangle size: ");
        BufferedReader triangle = new BufferedReader(new InputStreamReader(System.in));
        String sSide1 = triangle.readLine();

        try {
            if (isPositiveInteger(sSide1)) {
                int side1 = Integer.parseInt(sSide1);
                System.out.print("Enter the size of the second side of the triangle: ");
                String sSide2 = triangle.readLine();

                if (isPositiveInteger(sSide2)) {
                    int side2 = Integer.parseInt(sSide2);
                    System.out.print("Enter the third side of the triangle size: ");
                    String sSide3 = triangle.readLine();

                    if (isPositiveInteger(sSide3)) {
                        int side3 = Integer.parseInt(sSide3);

                        int summSide1 = side1 + side2;
                        int summSide2 = side1 + side3;
                        int summSide3 = side2 + side3;

                        if ((summSide1 > side3) && (summSide2 > side2) && (summSide3 > side1)) {

                            double perimeter = (side1 + side2 + side3) / 2.0;

                            return Math.sqrt(perimeter * (perimeter - side1) *
                                    (perimeter - side2) * (perimeter - side3));

                        } else {
                            System.out.println("Triangle with such parties does not exist!");
                            return 0;
                        }
                    } else {
                        throw new IOException(sSide3);
                    }
                } else {
                    throw new IOException(sSide2);
                }
            } else {
                throw new IOException(sSide1);
            }
        } catch (Exception e) {
            System.out.println("Side must be positive integer number!");
        }
        return 0;
    }

    public static int rectangleArea() throws IOException {
        System.out.println("Enter the dimensions of the rectangle: ");

        BufferedReader rectangle = new BufferedReader(new InputStreamReader(System.in));
        String sFirstSide = rectangle.readLine();
        String sSecondSide = rectangle.readLine();

        if ((isPositiveInteger(sFirstSide)) && (isPositiveInteger(sSecondSide))) {
            int firstSide = Integer.parseInt(sFirstSide);
            int secondSide = Integer.parseInt(sSecondSide);

            return firstSide * secondSide;
        } else try {
            throw new IOException(sFirstSide);
        } catch (IOException e) {
            System.out.println("Side must be positive integer number!");
        }
        return 0;
    }

    public static double circleArea() throws IOException {
        System.out.print("Enter the radius of the circle: ");

        BufferedReader circle = new BufferedReader(new InputStreamReader(System.in));
        String sRadius = circle.readLine();

        if (isPositiveInteger(sRadius)) { // calculate the area of a circle the radius
            int radius = Integer.parseInt(sRadius);
            return Math.PI * Math.pow(radius, 2.0);
        } else try {
            throw new IOException(sRadius);
        } catch (IOException e) {
            System.out.println("The radius must be positive integer number!");
        }
        return 0;
    }
}
