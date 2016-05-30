package ua.goit.Core.Module4;

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
            System.out.println("Enter the sides of triangle:");
            BufferedReader triangleReader = new BufferedReader(new InputStreamReader(System.in));
            String side1 = triangleReader.readLine();
            String side2 = triangleReader.readLine();
            String side3 = triangleReader.readLine();

            double triangleResult = triagleArea(side1, side2, side3);
            if (triangleResult > 0) System.out.println("The area of a triangle is: " + triangleResult);


        } else if (figure == 2) { // calculate the area of a rectangle
            System.out.println("Enter the sides of rectangle:");
            BufferedReader rectangleReader = new BufferedReader(new InputStreamReader(System.in));
            String side1 = rectangleReader.readLine();
            String side2 = rectangleReader.readLine();

            int rectangleResult = rectangleArea(side1, side2);
            if (rectangleResult > 0) System.out.println("The area is: " + rectangleResult);


        } else if (figure == 3) { // the area of a circle
            System.out.println("Enter the radius of circle:");
            BufferedReader circleReader = new BufferedReader(new InputStreamReader(System.in));
            String radius = circleReader.readLine();

            double circleResult = circleArea(radius);
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
            System.out.println("[Error] Must enter the positive integer number!");
            return false;
        }
    }

    public static double triagleArea(String sSide1, String sSide2, String sSide3) {

        if ((isPositiveInteger(sSide1)) && (isPositiveInteger(sSide2)) && (isPositiveInteger(sSide3))) {
            int side1 = Integer.parseInt(sSide1);
            int side2 = Integer.parseInt(sSide2);
            int side3 = Integer.parseInt(sSide3);

            int summSide1 = side1 + side2;
            int summSide2 = side1 + side3;
            int summSide3 = side2 + side3;

            if ((summSide1 > side3) && (summSide2 > side2) && (summSide3 > side1)) {

                double perimeter = (side1 + side2 + side3) / 2.0;

                return Math.sqrt(perimeter * (perimeter - side1) *
                        (perimeter - side2) * (perimeter - side3));
            } else {
                System.out.println("[Error] Triangle with such sides do not exist. " +
                        "The sum of any two sides must be greater than the third to the rectangle exist!");
                return 0;
            }
        }
        return 0;
    }

    public static int rectangleArea(String sFirstSide, String sSecondSide) throws IOException {

        if (isPositiveInteger(sFirstSide) && isPositiveInteger(sSecondSide)) {
            int firstSide = Integer.parseInt(sFirstSide);
            int secondSide = Integer.parseInt(sSecondSide);

            return firstSide * secondSide;
        }
        return 0;
    }

    public static double circleArea(String sRadius) throws IOException {

        if (isPositiveInteger(sRadius)) {
            int radius = Integer.parseInt(sRadius);

            return Math.PI * Math.pow(radius, 2.0);
        }
        return 0;
    }
}
