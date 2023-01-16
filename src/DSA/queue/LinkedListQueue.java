package DSA.queue;

public class LinkedListQueue {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty())
            head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int remove() {
        if (isEmpty())
            return -1;
        int result = head.data;
        if (head == tail)
            tail = null;
        head = head.next;
        return result;
    }
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.add(2);
        queue.add(3);
        queue.add(4);

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

    }
}