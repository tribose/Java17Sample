import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InterviewQs {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("A", "val1");
        map.put("B", "val2");
        map.put("C", "val3");
        map.put("D", "val4");

        Set<Map.Entry<String, String>> entries =map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "<>" + entry.getValue());
        }

        System.out.println("-------");
        map.entrySet().forEach(e -> System.out.println(e.getKey() + ":"+e.getValue()));
    }

}
