package DSA.linkedlist;

/*
 * A complete demonstration of Linked list insert front,
 * insert last and insert after a specific node
 */

public class SinglyLinkedList {

    private Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFront(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public void insertAfter(Node node, int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);

        if (node.next == null) {
            node.next = newNode;
            return;
        }
        Node nextNode = node.next;
        node.next = newNode;
        newNode.next = nextNode;
    }

    // update data of a particular node
    public void updateNodeData(Node node, int data) {
        if (node == null || head == null) {
            return;
        }
        Node prevNode = head;
        while (prevNode.next != node) {
            prevNode = prevNode.next;
        }
        prevNode.next.data = data;
    }

    // shift a node after a particular node
    public void shiftNode(Node nodeToShift, Node prevNode) {
        if (nodeToShift == null || prevNode == null) {
            return;
        }
        Node iNode = head;
        while (iNode.next != nodeToShift) {
            iNode = iNode.next;
        }
        if (nodeToShift.next == null) {
            iNode.next = null;
        }
        else {
            iNode.next = nodeToShift.next;
        }
        Node nextNode = prevNode.next;
        prevNode.next = nodeToShift;
        nodeToShift.next = nextNode;
    }

    // delete a particular node
    public void deleteNode(Node node) {
        if (node == null || head == null) {
            return;
        }
        Node iNode = head;
        while (iNode.next != node ) {
            iNode = iNode.next;
        }
        iNode.next = node.next;
    }

    // Delete the entire linked list
    public void deleteLinkedList() {
        if (head == null) {
            return;
        }
        head = null;
    }

    public void iterate() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.insertFront(10);
        linkedList.insertFront(20);
        linkedList.insertFront(30);
        linkedList.insertFront(40);
        linkedList.insertFront(50);
        linkedList.insertAfter(linkedList.head.next.next, 100);

        linkedList.insertLast(60);

        linkedList.updateNodeData(linkedList.head.next, 200);

        linkedList.shiftNode(linkedList.head.next.next.next, linkedList.head.next);

        linkedList.deleteNode(linkedList.head.next);

        linkedList.deleteLinkedList();

        linkedList.iterate();
    }
}
