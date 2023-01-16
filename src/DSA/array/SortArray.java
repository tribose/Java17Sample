package DSA.array;
/*
Sort an array of 0s, 1s and 2s (Simple Counting)
Dutch flag problem
 */
public class SortArray {

    public static void sortArray(int[] a) {
        int iZero, iOne, iTwo = iOne = iZero = 0;
        int n = a.length;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                iZero++;
            if (a[i] == 1)
                iOne++;
            if (a[i] == 2)
                iTwo++;
        }
        int x = 0;
        while (x < iZero) {
            a[x] = 0;
            x++;
        }
        x = 0;
        while (x < iOne) {
            a[iZero + x] = 1;
            x++;
        }
        x = 0;
        while (x < iTwo) {
            a[iZero + iOne + x] = 2;
            x++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    public static void solveDutchFlagProblem(int[] a) {
        int mid, low = mid = 0;
        int high = a.length - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    int temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = a[mid];
                    a[mid] = a[high];
                    a[high] = temp2;
                    high--;
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 2, 1, 2, 0, 1, 0, 1, 2, 0, 2, 1, 0};
        solveDutchFlagProblem(a);
    }
}
