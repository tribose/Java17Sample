package DSA.linkedlist;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a linked list, check if the linked list has loop or not. Use HashSet
 * Iterate over the linkedList and keep adding Nodes into a HashSet.
 * In next iteration, check if this hasSet contains a particular Node which is already added.
 */
public class LoopValidatorUseHashSet {

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

    public int hasLoop() {
        if (head == null) return -1;
        Node temp = head;
        Set<Node> s = new HashSet<>();
        while (temp.next != null) {
            if (s.contains(temp)) break;
            s.add(temp);
            temp = temp.next;
        }
        int count = 1;
        while (temp.next != null) {
            if (!s.equals(temp)) ++count;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LoopValidatorUseHashSet loopValidator = new LoopValidatorUseHashSet();
        loopValidator.push(10);
        loopValidator.push(20);
        loopValidator.push(30);
        loopValidator.push(40);
        loopValidator.push(50);

        loopValidator.head.next.next.next = loopValidator.head.next;

        System.out.println(loopValidator.hasLoop());
    }

}
