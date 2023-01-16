package DSA.linkedlist;

/*
    Find the middle of a given linked list using two pointer method
 */
public class MiddleNodeFinder {

    private Node head;
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (this.getHead() == null) {
            this.setHead(newNode);
            return;
        }
        Node temp = this.getHead();
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public Node findMiddleNode(){
        Node slowPointer;
        Node fastPointer;
        slowPointer = fastPointer = this.getHead();

        while (fastPointer != null && fastPointer.getNext() != null) {
            fastPointer = fastPointer.getNext().getNext();
            slowPointer = slowPointer.getNext();
        }
        return slowPointer;
    }

    public static void main(String[] args) {
        MiddleNodeFinder middleNodeFinder = new MiddleNodeFinder();
        middleNodeFinder.push(10);
        middleNodeFinder.push(20);
        middleNodeFinder.push(30);
        middleNodeFinder.push(40);
        middleNodeFinder.push(50);
        middleNodeFinder.push(60);
        middleNodeFinder.push(70);
        middleNodeFinder.push(80);
        middleNodeFinder.push(90);
        middleNodeFinder.push(100);

        Node middleNode = middleNodeFinder.findMiddleNode();
        System.out.println(middleNode.getData());
    }
}
