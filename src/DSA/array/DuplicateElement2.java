package DSA.array;

public class DuplicateElement2 {

    public static void findDuplicate(int[] arr, int n) {
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[arr[i]] = arr[arr[i]] + n;
        }
        for (int i : arr) {
            if (i / n >= 2 )
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 3};
        findDuplicate(arr, arr.length);
    }
}
