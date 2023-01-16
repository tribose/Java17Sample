package DSA.stack;

public class TwoStacks {

    int[] arr;
    int top1, top2, size;

    public TwoStacks(int size) {
        arr = new int[size];
        this.top1 = - 1;
        this.top2 = size;
    }

    public void push1(int data) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = data;
        }
    }

    public void push2(int data) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = data;
        }
    }

    public int pop1() {
        if (top1 != -1) {
            int x = arr[top1];
            top1--;
            return x;
        }
        return -1;
    }

    public int pop2() {
        if (top2 != arr.length){
            int x = arr[top2];
            top2++;
            return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        TwoStacks twoStacks = new TwoStacks(10);
        twoStacks.push1(100);
        twoStacks.push1(200);
        twoStacks.push1(111);
        twoStacks.push2(300);
        twoStacks.push2(400);
        twoStacks.push2(444);

        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks.pop2());
    }
}
