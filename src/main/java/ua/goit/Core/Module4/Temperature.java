package ua.goit.Core.Module4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * class Temperature
 *
 * Create a class value converting Celsius temperature
 * Value in Fahrenheit and vice versa.
 *
 * Created by coura on 07.03.2016.
 */
public class Temperature {

    public static void main(String[] args) throws Exception {

        System.out.println("If you want to convert Celsius to Fahrenheit, type \"c\".");
        System.out.println("If you want to convert Fahrenheit to Celsius, type \"f\".");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String degrees = reader.readLine();
        String stemperature = reader.readLine();

        int temperature = Integer.parseInt(stemperature);

        if (degrees.equals("c")) {

            double fahrenheit = (temperature * 1.8) + 32;
            System.out.println(temperature + "\'C it's " + fahrenheit + "\'F");

        } else if (degrees.equals("f")) {

            double celsius = (temperature - 32) / 1.8;
            System.out.println(temperature + "\'F it's " + celsius + "\'C");
        } else {
            System.out.println("Incorrect input.");
        }
    }
}
