package ProblemOfTheDay;

import java.util.Stack;

class PostFixEvaluation {
    public int evaluatePostfix(String[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (String token : arr) {
            if (isOperator(token)) {
                int b = stack.pop(); // second operand
                int a = stack.pop(); // first operand
                int result = applyOperator(a, b, token);
                stack.push(result);
            } else {
                // Try parsing the token
                try {
                    stack.push(Integer.parseInt(token));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid token: " + token);
                }
            }
        }

        return stack.pop(); // final result
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || 
               token.equals("*") || token.equals("/") || 
               token.equals("^");
    }

    private int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": 
                int result = a / b;
                // floor division handling
                if (a * b < 0 && a % b != 0) {
                    result--;
                }
                return result;
            case "^":
                return (int) Math.pow(a, b); // Exponentiation
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
