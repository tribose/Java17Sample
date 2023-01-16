package immitable;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "john");
        map.put("2", "micheal");

        CustomImmutableDemo demo = new CustomImmutableDemo(101, "123ABC", map);
        System.out.println(demo.getMetadata());

        demo.getMetadata().put("3", "Balak");

        System.out.println(demo.getMetadata());

        demo.getMetadata().remove("1");
        System.out.println(demo.getMetadata());
    }
}
