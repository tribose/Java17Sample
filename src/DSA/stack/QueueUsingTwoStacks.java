package DSA.stack;

import java.util.Stack;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        QueueB queueB = new QueueB();
        queueB.add(2);
        queueB.add(3);
        queueB.add(4);

        System.out.println(queueB.getS1());
        System.out.println(queueB.remove());
        System.out.println(queueB.remove());
        System.out.println(queueB.remove());
    }

    public static class QueueB {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public Stack<Integer> getS1() {
            return s1;
        }

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while(!s1.isEmpty())
                s2.push(s1.pop());

            s1.push(data);

            while(!s2.isEmpty())
                s1.push(s2.pop());
        }

        public Integer remove() {
            return s1.pop();
        }

        public Integer peek() {
            return s1.peek();
        }
    }

}
