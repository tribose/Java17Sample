package DSA.linkedlist;

/*
    Program for n’th node from the end of a Linked List using two pointers
 */
public class NthNodeFinder {

    private Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void push(int data) {
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
    public Node findNthNodeFromEnd(int index) {
        if (head == null) {
            return null;
        }
        Node mainRef;
        Node tempRef;
        mainRef = tempRef = head;
        for (int i = 0; i < index - 1; i++) {
            tempRef = tempRef.next;
        }
        while (tempRef.next != null) {
            mainRef = mainRef.next;
            tempRef = tempRef.next;
        }
        return mainRef;
    }

    public static void main(String[] args) {
        NthNodeFinder nthNodeFinder = new NthNodeFinder();
        nthNodeFinder.push(10);
        nthNodeFinder.push(20);
        nthNodeFinder.push(30);
        nthNodeFinder.push(40);
        nthNodeFinder.push(50);
        nthNodeFinder.push(60);
        nthNodeFinder.push(70);
        nthNodeFinder.push(80);
        nthNodeFinder.push(90);

        Node result = nthNodeFinder.findNthNodeFromEnd(3);
        System.out.println(result.data);
    }
}
