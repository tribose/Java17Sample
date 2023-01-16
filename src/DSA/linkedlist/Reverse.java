package DSA.linkedlist;

public class Reverse {

    static Node head;

    public static void main(String[] args) {
        Reverse list = new Reverse();
        head = new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        list.iterate(head);

        head = list.reverse(head);
        System.out.println("After reverse");
        list.iterate(head);
    }



    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void iterate(Node node) {
        while (node != null) {
            System.out.print(node.data + ", ");
            node = node.next;
        }
    }

    public Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
