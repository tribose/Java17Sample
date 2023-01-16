package DSA.array;

public class ReverseArray {

    public static void reverse(int[] arr, int start, int end) {
        int temp;
        if (start >= end) return;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end - 1);
    }

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr);
        reverse(arr, 0, 5);
        System.out.println("Reversed array is ");
        printArray(arr);
    }
}
