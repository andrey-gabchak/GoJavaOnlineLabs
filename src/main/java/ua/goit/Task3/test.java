package ua.goit.Task3;

/**
 * Created by coura on 16.05.2016.
 */
public class test {
    public static void main(String[] args) {
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        int result = reversePolishNotation.evaluate("17 2 -");
        System.out.println(result);
    }
}
