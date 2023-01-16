package queue.blockingqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public static void main(String[] args) {
        BalancedBrackets balancedBrackets = new BalancedBrackets();

        String str = "[{(TT)}KK}";
        if(balancedBrackets.validateBalancedBracket(str))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

    public boolean validateBalancedBracket(String str) {
        char[] chars = str.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for (char aChar : chars) {
            if (aChar == '[' || aChar == '{' || aChar == '(') {
                stack.push(aChar);
                continue;
            }

            char c;
            switch (aChar) {
                case ')':
                    c = stack.pop();
                    if (c == '}' || c == ']')
                        return false;
                    break;

                case '}':
                    c = stack.pop();
                    if (c == ')' || c == ']')
                        return false;
                    break;
                case ']':
                    c = stack.pop();
                    if (c == ')' || c == '}')
                        return false;
                    break;
                default:
                    break;
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
