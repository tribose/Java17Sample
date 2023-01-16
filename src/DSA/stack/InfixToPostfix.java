package DSA.stack;

import java.util.Stack;

public class InfixToPostfix {

    String expression = "A+B*C-D*E";

    StringBuilder postfix = new StringBuilder();
    Stack<Character> operators = new Stack<>();

    public String convertExpression(String expression) {
        for (char ch : expression.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
               postfix.append(ch);
            }
            if (isOperator(ch)) {
                while (!operators.isEmpty()) {
                    if (isHigherOperatorPrecedence(ch, operators.peek())) {
                        operators.push(ch);
                    } else {
                        while (!operators.isEmpty()) {
                            postfix.append(operators.pop());
                        }
                    }
                }
                operators.push(ch);
            }
        }
        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
        }
        return postfix.toString();
    }

    private boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public int getResult(char ops, int value1, int value2) {
        int result = 0;
        switch (ops) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            case '/':
                if (value2 == 0) throw new ArithmeticException();
                result = value1 / value2;
                break;
            default:
                break;
        }
        return result;
    }

    public boolean isHigherOperatorPrecedence(char ops1, char ops2) {

        if ((ops1 == '+' || ops1 == '-') && (ops2 == '*' || ops2 == '/')) return true;
        if ((ops1 == '+' || ops1 == '-') && (ops2 == '+' || ops2 == '-')) return false;
        if ((ops1 == '*' || ops1 == '/') && (ops2 == '*' || ops2 == '/')) return false;

        return false;
    }

    public static void main(String[] args) {

        String expression = "A+B*C-D*E";
       // String expression = "A+B*";

        InfixToPostfix infixToPostfix = new InfixToPostfix();
        System.out.println(infixToPostfix.convertExpression(expression));
    }
}
