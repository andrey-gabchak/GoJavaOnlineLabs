package ua.goit.Core.Module6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import ua.goit.Core.Module4.Area;

/**
 * class AreaForPatterns
 *
 * Create a class that calculates the area of simple geometric figures: triangle, rectangle and circle.
 * Please add the code of existing classes of exception handling. In this case use an existing class.
 * Create your own exception class and write code for its generation and processing.
 *
 * Created by coura on 07.03.2016.
 */

class AreaForPatterns {

    public static void main(String[] args) throws IOException {
        System.out.println("Select the area of a shape necessary to calculate:");
        System.out.println("Triangle - type 1");
        System.out.println("Rectangle - enter 2");
        System.out.println("Circle - type 3");

        Scanner scanner = new Scanner(System.in);
        int figure = scanner.nextInt();

        // calculate the area of a triangle
        if (figure == 1) {

            /**
             * In the module 6 to the exceptions I have used the task
             * from the 4th module (finding the area of figures).
             * Anti-pattern duplicated code (Copy/Paste).
             * Possible solutions:
             * 1. Expose the area to find figures in the individual methods in /main.java.ua.goit.Core.Module4/AreaForPatterns.class.
             * Calling methods in /main.java.ua.goit.Core.Module6/AreaForPatterns.class, and not duplicate code.
             * 2. To carry out the calculation figures in the area of individual classes.
             * For example, TriangleArea.class.
             * And cause classes if needed for calculating the figures.
             */

            System.out.println("Enter the sides of triangle:");
            BufferedReader triangleReader = new BufferedReader(new InputStreamReader(System.in));
            String side1 = triangleReader.readLine();
            String side2 = triangleReader.readLine();
            String side3 = triangleReader.readLine();

            Area.triagleArea(side1, side2, side3);

        } else if (figure == 2) { // calculate the area of a rectangle

            System.out.println("Enter the sides of rectangle:");
            BufferedReader rectangleReader = new BufferedReader(new InputStreamReader(System.in));
            String side1 = rectangleReader.readLine();
            String side2 = rectangleReader.readLine();
            Area.rectangleArea(side1, side2);

        } else if (figure == 3) { // the area of a circle
            System.out.println("Enter the radius of circle:");
            BufferedReader circleReader = new BufferedReader(new InputStreamReader(System.in));
            String radius = circleReader.readLine();

            Area.circleArea(radius);

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
