package DSA.queue;

public class Queue {

    int rear, size;
    int[] arr;

    public Queue(int size) {
        this.arr = new int[size];
        this.rear = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return size - 1  == rear;
    }

    public void add(int ele) {
        if(isFull()) {
            System.out.println("Queue us full");
            return;
        }
        else {
            arr[++rear] = ele;
        }
    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            int front = arr[0];
            for( int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }
        return arr[0];

    }

    public void printQueue() {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
      //  queue.add(6);

        queue.printQueue();

        queue.remove();

        queue.printQueue();
    }
}
