package DSA.stack;

/*
* Problem : Reverse a word using stack.
* Sol: Push each char in stack and then pop one by one
* */
public class ReverseWord {

    int top, size;
    char[] arr;

    public ReverseWord(int size) {
        this.size = size;
        arr = new char[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char data) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        ++top;
        arr[top] = data;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return '\u0000';
        }
        char ch = arr[top];
        --top;
        return ch;
    }

    public static void main(String[] args) {
        String word = "my name is khan";
        ReverseWord reverseWord = new ReverseWord(word.length());
        for (char ch : word.toCharArray()) {
            reverseWord.push(ch);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            builder.append(reverseWord.pop());
        }
        System.out.println(builder);
    }
}
