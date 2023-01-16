package DSA.linkedlist2;

public class ReverseLinkedList {

    private Node head;
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.push(10);
        reverseLinkedList.push(20);
        reverseLinkedList.push(30);
        reverseLinkedList.push(40);
        reverseLinkedList.push(50);
        reverseLinkedList.push(60);
        reverseLinkedList.push(70);

        Node node = reverseLinkedList.reverseItr();
        while (node.next != null) {
            System.out.println(node.data);
        }
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

    private Node reverseItr() {
        Node current = head;
        Node next, prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
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
