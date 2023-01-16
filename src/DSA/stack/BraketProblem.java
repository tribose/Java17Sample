package DSA.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BraketProblem {

    static char b1 = '(';
    static char b2 = '{';
    static char b3 = '[';
    static char b4 = ')';
    static char b5 = '}';
    static char b6 = ']';

    static Deque<Character> deque = new ArrayDeque<>();
    Queue<Integer> q1 = new LinkedList<>();

    public static void push(char braket) {
        deque.push(braket);
    }

    public static boolean pop(char braket) {
        char br;
        switch (braket) {
            case ')':
                br = deque.pop();
                if (br == b5 || br == b6)
                    return false;
                break;
            case '}':
                br = deque.pop();
                if (br == b4 || br == b6)
                    return false;
                break;
            case ']':
                br = deque.pop();
                if (br == b4 || br == b5)
                    return false;
                break;
            default:
                break;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "[()]{{}";
        char[] br = str.toCharArray();
        boolean result = false;

        for(char ch : br) {
            if(ch == b1 || ch == b2 || ch == b3)
                push(ch);
            else {
                result = pop(ch);
                if (!result)
                    break;
            }
        }
        if (result && deque.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not balanced");
    }
}
