package DSA.linkedlist2;

public class LengthFinder {

    private Node head;

    public static void main(String[] args) {

        LengthFinder lengthFinder = new LengthFinder();
        lengthFinder.push(10);
        lengthFinder.push(20);
        lengthFinder.push(30);
        lengthFinder.push(40);
        lengthFinder.push(50);
        lengthFinder.push(60);
        lengthFinder.push(70);

        lengthFinder.iterate();
    }

    private void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    private void iterate() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
