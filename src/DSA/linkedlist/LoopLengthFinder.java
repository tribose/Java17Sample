package DSA.linkedlist;

import java.util.HashSet;
import java.util.Set;

/*
 * Write a function detectAndCountLoop() that checks whether a given Linked List
 * contains loop and if loop is present then returns count of nodes in loop.
 */
public class LoopLengthFinder {
    Node head;

    public static class Node {
        public int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public boolean detectAndCountLoop() {
        if (head == null) return false;
        Set<Node> s = new HashSet<>();
        Node temp = head;
        while (temp.next != null) {
            if (s.contains(temp))
                return true;
            s.add(temp);
            temp = temp.next;
        }
        return false;
    }

    public int findEndLoopNode() {
        int count = 0;
        if (detectAndCountLoop()) {
            Node temp = head;
            Node prevNode = head;
            Set<Node> s = new HashSet<>();
            while (temp.next != null) {
                if (s.contains(temp))
                    break;
                s.add(temp);
                prevNode = temp;
                temp = temp.next;
            }
            Set<Node> s2 = new HashSet<>();
            while (prevNode.next != null) {
                if (s2.contains(prevNode)) break;
                s2.add(prevNode);
                prevNode = prevNode.next;
            }
            count = s2.size();
        }
        return count;
    }


    public static void main(String[] args) {
        LoopLengthFinder loopLengthFinder = new LoopLengthFinder();
        loopLengthFinder.push(10);
        loopLengthFinder.push(20);
        loopLengthFinder.push(30);
        loopLengthFinder.push(40);
        loopLengthFinder.push(50);

        loopLengthFinder.head.next.next.next.next = loopLengthFinder.head.next;

        System.out.println(loopLengthFinder.findEndLoopNode());
    }
}
