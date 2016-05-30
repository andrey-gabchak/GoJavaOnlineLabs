package ua.goit.Practice.Practice3.Task3;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by coura on 16.05.2016.
 */
public class LightCalculator {
    private final String OPERATORS = "+-*/";
    private Stack<String> stackOperations = new Stack<>();
    private Stack<String> stackRPN = new Stack<>();
    private Stack<Integer> stackResult = new Stack<>();

    public int evaluate(String expression) {

        Stack<String> stack = parsing(expression);
        for (String s : stack) {
            try {
                stackResult.push(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                if (s.equals("*")) {
                    stackResult.push(stackResult.pop() * stackResult.pop());
                } else if (s.equals("/")) {
                    stackResult.push(stackResult.pop() / stackResult.pop());
                } else if (s.equals("+")) {
                    stackResult.push(stackResult.pop() + stackResult.pop());
                } else if (s.equals("-")) {
                    stackResult.push(stackResult.pop() - stackResult.pop());
                }
            }
        }
        return stackResult.pop();
    }

    protected Stack<String> parsing(String expression) {
        stackOperations.clear();
        stackRPN.clear();

        if (expression.charAt(0) == '-') {
            expression = "0" + expression;
        }

        StringTokenizer expressionTokenizer = new StringTokenizer(expression, OPERATORS, true);

        while (expressionTokenizer.hasMoreTokens()) {
            String token = expressionTokenizer.nextToken();
            if (isNumber(token)) {
                stackRPN.push(token);
            } else if (isOperator(token)) {
                while (!stackOperations.empty()
                        && isOperator(stackOperations.lastElement())
                        && getPrecedence(token) <= getPrecedence(stackOperations
                        .lastElement())) {
                    stackRPN.push(stackOperations.pop());
                }
                stackOperations.push(token);
            }
        }
        while (!stackOperations.empty()) {
            stackRPN.push(stackOperations.pop());
        }

        return stackRPN;
    }

    private boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean isOperator(String token) {
        return OPERATORS.contains(token);
    }

    private byte getPrecedence(String token) {
        if (token.equals("-") || token.equals("+")) {
            return 1;
        }
        return 2;
    }
}
