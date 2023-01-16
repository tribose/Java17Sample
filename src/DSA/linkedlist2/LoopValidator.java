package DSA.linkedlist2;

public class LoopValidator {

    private Node head;

    public static void main(String[] args) {
        LoopValidator loopValidator = new LoopValidator();
        loopValidator.push(10);
        loopValidator.push(20);
        loopValidator.push(30);
        loopValidator.push(40);
        loopValidator.push(50);
        loopValidator.push(60);
        loopValidator.push(70);

        loopValidator.iterate();
        Node head = loopValidator.getHead();
        head.next.next.next.next = head;
        System.out.println(loopValidator.doesLoopExists());
    }

    private Node getHead() {
        return head;
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
        Node temp = head;
        while(temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private boolean doesLoopExists() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.visited)
                return true;

            temp.visited = true;
            temp = temp.next;
        }
        return false;
    }

    private static class Node {
        int data;
        boolean visited;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
