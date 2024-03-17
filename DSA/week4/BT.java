package DSA.week4;

import java.util.Stack;

public class BT {
    public static double evaluatePostfix(String expression) {
        Stack<Double> stack = new Stack<>();

        String[] array = expression.split("\\s+");
        for (String element : array) {
            if (isNumeric(element)) {
                stack.push(Double.parseDouble(element));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                switch (element) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String expression = "4.5 1.2 * 5.0 + 6.0 1.5 * +";
        double result = evaluatePostfix(expression);
        System.out.println("Giá trị của biểu thức hậu tố là: " + result);
    }
}
