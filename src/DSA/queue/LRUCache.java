package DSA.queue;

public class LRUCache {

    int rear, front, size;
    int[] arr;

    public LRUCache(int size) {
        this.arr = new int[size];
        this.rear = -1;
        this.front = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void add(int ele) {
        if(isFull()) {
            System.out.println("Queue us full");
            return;
        }
        if (front == -1) front = 0;

        rear = (rear + 1 ) % size;
        arr[rear] = ele;
    }

    public int get(int data) {
        if(isEmpty()) {
            return -1;
        }
        int result = -1;
        int index = 0;
        for (int j : arr) {
            if (j == data) {
                result = data;
                index = j;
                break;
            }
        }
        if (result == -1) return result;
        arr[index - 1] = arr[rear];
        arr[rear] = data;
        return data;
    }

    public void addFront(int ele) {
        if (isFull()) {
            System.out.println("Queue us full");
            return;
        }

        front = (front - 1 ) % size;
        if (front == -1) front = 0;
        arr[front] = ele;
    }

    public void addRear(int ele) {
        if (isFull()) {
            System.out.println("Queue us full");
            return;
        }
        if (rear == -1) rear = 0;

        rear = (rear + 1) % size;
        arr[rear] = ele;
    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
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
            System.out.println(i+ " : " +arr[i]);
        }
    }

    public static void main(String[] args) {
        LRUCache queue = new LRUCache(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

    //    queue.printQueue();

        queue.get(4);
/*
        queue.remove();
        queue.remove();

        queue.addFront(6);

        //queue.remove();

        queue.addFront(7);

        queue.printQueue();*/
        System.out.println(queue.front + "<>" + queue.rear);
    }
}
