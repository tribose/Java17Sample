package DSA.queue;

public class DequeCircular {

    int rear, front, size;
    int arr[];

    public DequeCircular(int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.arr = new int[size];
    }

    public boolean isFull() {
        return ((front == 0 && rear == size - 1));
    }

    public boolean isEmpty() {
        return front == -1 && rear == 0;
    }

    public void insertFront(int data) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) {
            front = size;
        }
        front--;
        arr[front] = data;
    }

    public void insertRear(int data) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        else if (rear == size - 1) {
            rear = -1;
        }
        rear++;
        arr[rear] = data;
    }

    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        int x = arr[front];
        front++;
        return x;
    }

    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("underflow");
            return -1;
        }
        int x = arr[rear];
        rear--;
        return x;
    }



    public static void main(String[] args) {
        DequeCircular circular = new DequeCircular(5);
        circular.insertFront(11);
        circular.insertFront(22);
        circular.insertFront(33);
        circular.insertRear(44);
        circular.insertRear(55);

        circular.deleteFront();
        circular.deleteRear();
        circular.insertRear(66);
        circular.insertFront(77);
    }
}
