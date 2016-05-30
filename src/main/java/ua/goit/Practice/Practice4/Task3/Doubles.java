package ua.goit.Practice.Practice4.Task3;

/**
 * Created by coura on 23.05.2016.
 *
 * Дано рядок, що представляє певне чило. Необхідно повернути число.
 Якщо це неможливо, повернути null
 Наприклад:
 "-2.e10"
 "+.3"
 ".e2" повертає null
 */

public class Doubles {
    public Double parse(String s) {
        Double result = null;
        try {
            result = Double.parseDouble(s);
        } catch (NumberFormatException e){}
        return result;
    }
}
