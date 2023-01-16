package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 832. Flipping an Image
public class Problem832 {
    public static int[][] flipAndInvertImage(int[][] image) {

        for (int[] ints : image) {

            Collections.reverse(List.of(ints));
            /*int[] temp = new int[image[i].length];
            System.arraycopy(image[i], 0, temp, 0, image[i].length);
            for (int j = 0; j < temp.length; j++) {
                image[i][j] = temp[temp.length - 1 - j];
            }*/
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                }else if (image[i][j] == 1) {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 0;
        arr[1][0] = 1;
        arr[1][1] = 0;
        arr[1][2] = 1;
        arr[2][0] = 0;
        arr[2][1] = 0;
        arr[2][2] = 0;

        int [][] image = flipAndInvertImage(arr);
        for (int[] ints : image) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
