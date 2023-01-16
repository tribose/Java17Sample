package DSA.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Find common elements in three sorted arrays
 */
public class FindCommon {

    public static void main(String[] args) {
        int ar1[] = {1, 5, 10, 20, 40, 80, 80};
        int ar2[] = {6, 7, 20, 80, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 80, 120};

        Set<Integer> mySet = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int ele : ar1) {
            mySet.add(ele);
        }

        for (int ele : ar2) {
            if (mySet.contains(ele)) {
                if (!list.contains(ele)) {
                    list.add(ele);
                }
            } else {
                mySet.add(ele);
            }
        }

        for (int ele : ar3) {
            if (mySet.contains(ele)) {
                if (!list.contains(ele)) {
                    list.add(ele);
                }
            } else {
                mySet.add(ele);
            }
        }

        System.out.println(list);
    }
}
