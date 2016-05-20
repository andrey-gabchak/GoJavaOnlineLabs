package ua.goit.Practice3.Task3;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by coura on 16.05.2016.
 *
 * Дано арифметичний вираз у вигляді Польського Інверсного запису.
 * Необхідно обчислити значення виразу і повернути його.
 * Вираз складається лише з цілих чисел і операцій +, -, *, /. Гарантується, що результат також ціне число.
 */
public class ReversePolishNotation {
    public int evaluate(String expression) {
        Stack<String> stackPRN = new Stack<>();
        Stack<Integer> stackResult = new Stack<>();
        StringTokenizer expressionToStack = new StringTokenizer(expression);

        while (expressionToStack.hasMoreTokens()) {
            stackPRN.push(expressionToStack.nextToken());
        }

        for (String s : stackPRN) {
            try {
                stackResult.push(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                if (s.equals("*")) {
                    stackResult.push(stackResult.pop() * stackResult.pop());
                } else if (s.equals("/")) {
                    int a = stackResult.pop(), b = stackResult.pop();
                    stackResult.push(b / a);
                } else if (s.equals("+")) {
                    stackResult.push(stackResult.pop() + stackResult.pop());
                } else if (s.equals("-")) {
                    int a = stackResult.pop(), b = stackResult.pop();
                    stackResult.push(b - a);
                }
            }
        }

        return stackResult.pop();
    }
}
