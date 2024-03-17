package DSA.week4.ex3;

public class ExpressionValidator {
    public static boolean isValidExpression(String expression) {
        MyStack<Character> stack = new MyStack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "(a - b) * c - d)";
        String expression2 = "(10 - 8/((2 + 5) * 17)";
        String expression3 = ")u - v) * (m + n)";

        System.out.println("Expression 1 is valid: " + isValidExpression(expression1));
        System.out.println("Expression 2 is valid: " + isValidExpression(expression2));
        System.out.println("Expression 3 is valid: " + isValidExpression(expression3));


        System.out.println("=============================================");

        String expression4= "(a - b) * (c + d)";
        String expression5 = "(10 + 8)/((5 - 2) * 17)";

        System.out.println("Expression 4 is valid: " + isValidExpression(expression4));
        System.out.println("Expression 5 is valid: " + isValidExpression(expression5));
    }
}

