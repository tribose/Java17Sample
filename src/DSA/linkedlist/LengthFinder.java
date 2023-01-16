package DSA.linkedlist;

public class LengthFinder {
    Node head;

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
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

    public void iterate() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int findLength(){
        if (head == null) return -1;
        Node temp = head;
        int count = 1;
        while (temp.next != null) {
            temp = temp.next;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        LengthFinder lengthFinder = new LengthFinder();

        lengthFinder.insert(10);
        lengthFinder.insert(20);
        lengthFinder.insert(30);
        lengthFinder.insert(40);
        lengthFinder.insert(50);

        System.out.println(lengthFinder.findLength());
    }
}
