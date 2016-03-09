package Module4;

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
        String sfigure = reader.readLine();

        int figure = Integer.parseInt(sfigure);

        // calculate the area of a triangle
        if (figure == 1) {
            System.out.print("Enter the first side of the triangle size: ");
            BufferedReader triangle = new BufferedReader(new InputStreamReader(System.in));
            String sSide1 = triangle.readLine();

            System.out.print("Enter the size of the second side of the triangle: ");
            String sSide2 = triangle.readLine();

            System.out.print("Enter the third side of the triangle size: ");
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

                    System.out.println("The area of a triangle is: " + area);

                } else {

                    System.out.println("Triangle with such parties does not exist!");
                }

            } else {

                System.out.println("Side should be greater than zero!");
            }

        } else if (figure == 2) { // calculate the area of a rectangle

            System.out.println("Enter the dimensions of the rectangle: ");

            BufferedReader rectangle = new BufferedReader(new InputStreamReader(System.in));
            String sFirstSide = rectangle.readLine();
            String sSecondSide = rectangle.readLine();

            int firstside = Integer.parseInt(sFirstSide);
            int secondside = Integer.parseInt(sSecondSide);

            if ((firstside > 0) && (secondside > 0)) {
                int area = firstside * secondside;
                System.out.println("The area is: " + area);
            } else {
                System.out.println("Side should be greater than zero!");
            }
        } else if (figure == 3) { // the area of a circle

            System.out.print("Enter the radius of the circle: ");

            BufferedReader circle = new BufferedReader(new InputStreamReader(System.in));
            String sradius = circle.readLine();

            int radius = Integer.parseInt(sradius);

            if (radius > 0) { // calculate the area of a circle the radius
                double area = Math.PI * Math.pow(radius, 2.0);
                System.out.println("area of a circle is: " + area);
            } else {
                System.out.println("The radius must be greater than zero!");
            }
        } else {

            System.out.println("Permission incorrect value! It is necessary to select 1, 2 or 3.");
        }
    }
}
