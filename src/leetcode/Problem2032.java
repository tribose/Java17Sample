package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem2032 {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};

        List<Integer> list = twoOutOfThree(nums1, nums2, nums3);
        System.out.println(list);
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>(), set3 = new HashSet<>(), set = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
            set.add(i);
        }

        for (int i : nums2) {
            set2.add(i);
            set.add(i);
        }

        for (int i : nums3) {
            set3.add(i);
            set.add(i);
        }

        List<Integer> list = new ArrayList<>();
        for (int i : set) {
            if (set1.contains(i) && set2.contains(i)
            || set1.contains(i) && set3.contains(i)
            || set2.contains(i) && set3.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
