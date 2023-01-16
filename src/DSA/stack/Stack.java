package DSA.stack;

public class Stack {

    int top;
    int size;
    int[] arr;
    public Stack(int size) {
        arr = new int[size];
        this.size = size;
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        int result = arr[top];
        --top;
        return result;
    }


    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);

        stack.pop();
    }
}
