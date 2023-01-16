package DSA.array;
/*
Array: Find the maximum and minimum element in an array
 */
public class MaxMinArrayElement {

    static class Pair {
        int min;
        int max;
    }

    public static Pair getMinMax(int[] arr, int n) {
        Pair pair = new Pair();
        if (n == 1) {
            pair.max = arr[0];
            pair.min = arr[0];
            return pair;
        }
        if (arr[1] > arr[0]) {
            pair.max = arr[1];
            pair.min = arr[0];
        } else {
            pair.max = arr[0];
            pair.min = arr[1];
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] > pair.max)
                pair.max = arr[i];
            else if (arr[i] < pair.min)
                pair.min = arr[i];
        }
        return pair;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }
}
