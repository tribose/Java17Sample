package DSA.array;

/*
Move all negative numbers to beginning and positive to end with constant extra space
 */
public class NegativeElement {

    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                j++;
            }
        }

        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
