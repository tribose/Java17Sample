package DSA.array;

/*
/ Java program to put all negative
// numbers before positive numbers using Dutch flag problem
 */
public class NegativeElementFirst {


    public static void placeNegativeElementFirst(int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            if (a[low] < 0) low++;
            else {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                high--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +", ");
        }
    }
    public static void main(String[] args) {
    int[] a = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
    placeNegativeElementFirst(a);
    }
}
