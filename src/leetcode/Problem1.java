package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Remove vowels from a string
 */
public class Problem1 {

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        System.out.println(problem1.canConstruct("aa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        int r = ransomNote.length();
        int m = magazine.length();

        if (r > m) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < m; i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        for(int i = 0; i < r; i++) {
            char ch = ransomNote.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) == 0) return false;
        //    map.put(ch, map.get(ch) - 1);
        }
        System.out.println(map);
        return true;
    }
}
