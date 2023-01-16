package DSA.array;

public class MergeWithoutExtraHeap {
    public static void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        if (n <= m) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr1[i] > arr2[j]) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j];
                        arr2[j] = temp;
                        break;

                    }
                }
            }
        }
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + ",");
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        merge(arr1, arr2, arr1.length, arr2.length);
    }

}
