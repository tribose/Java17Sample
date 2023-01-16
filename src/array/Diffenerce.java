package array;

import java.util.Arrays;

public class Diffenerce {

    public static void main(String[] args) {
        Integer[] array = {5, 20, 3, 2, 50, 80};
        Integer[] list = array;

        int n = 78;
        for (Integer i: list) {
            //Arrays.stream(list).findAny()
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                int diff = Math.abs( array[i] - array[i + 1]);
                if (diff == n) {
                    System.out.println(i +"<>"+ i+1);
                }
            }
        }
    }
}
