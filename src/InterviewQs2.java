import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterviewQs2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        Set<Integer> set = new HashSet<>();

        /*List<Integer> list3 = list.stream().distinct().collect(Collectors.toList());

        list.removeAll(list3);

        System.out.println(list);*/



        list.stream().forEach(e -> {
            if (set.contains(e)) {
                System.out.println(e);
            } else {
                set.add(e);
            }
        });
    }

}
