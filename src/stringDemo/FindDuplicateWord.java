package stringDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateWord {

    public static void main(String[] args) {
        String s1 = "The only way out of this tunnel is to break the walls";

        String[] words = s1.split("\\s+");
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (String word: words) {
            if (!set.add(word.toLowerCase())) {
                list.add(word);
            }
        }
        list.forEach(System.out::println);
    }
}
