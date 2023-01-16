package DSA.array;
/*
find duplicate in an array of N+1 Integers
 */
public class DuplicateElement {

    public static void findDuplicateElement(int[] arr, int n) {
        int[] frequencyArr = new int[n];
        for (int i : arr) {
            frequencyArr[i]++;
        }
        for (int i : frequencyArr) {
            if (i >= 2)
                System.out.print(frequencyArr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 2, 0 , 1};
        findDuplicateElement(arr, arr.length);
    }
}
