package DSA.linkedlist;

/*
 * Given a linked list, check if the linked list has loop or not. Use pointer
 */
public class LoopValidatorUsePointer {

    Node head;

    public static class Node {
        public int data;
        public boolean visited;
        private Node next;

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

    public boolean hasLoop() {
        if (head == null) return false;
        Node temp = head;
        while (temp.next != null) {
            if (temp.visited) return true;
            temp.visited = true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LoopValidatorUsePointer loopValidator = new LoopValidatorUsePointer();
        loopValidator.push(10);
        loopValidator.push(20);
        loopValidator.push(30);
        loopValidator.push(40);
        loopValidator.push(50);

        loopValidator.head.next.next.next = loopValidator.head.next;

        System.out.println(loopValidator.hasLoop());
    }

}
