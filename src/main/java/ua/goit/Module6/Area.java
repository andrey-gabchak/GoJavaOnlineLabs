package ua.goit.Module6;

import java.io.IOException;
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
             * 1. Expose the area to find figures in the individual methods in /main.java.ua.goit.Module4/Area.class.
             * Calling methods in /main.java.ua.goit.Module6/Area.class, and not duplicate code.
             * 2. To carry out the calculation figures in the area of individual classes.
             * For example, TriangleArea.class.
             * And cause classes if needed for calculating the figures.
             */

            ua.goit.Module4.Area.triagleArea();

        } else if (figure == 2) { // calculate the area of a rectangle
            ua.goit.Module4.Area.rectangleArea();

        } else if (figure == 3) { // the area of a circle
            ua.goit.Module4.Area.circleArea();

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
