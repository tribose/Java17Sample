package queue.blockingqueue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerDemo {


    public static void main(String[] args) {

        int BOUND = 10;
        int N_PRODUCER = 4;
        int N_CONSUMER = Runtime.getRuntime().availableProcessors();
        System.out.println("N_CONSUMER :" +N_CONSUMER);
        int POISON_PILL = Integer.MAX_VALUE;
        int POISON_PILL_PER_PRODUCER = N_CONSUMER / N_PRODUCER;
        System.out.println("POISON_PILL_PER_PRODUCER : " +POISON_PILL_PER_PRODUCER);
        int mod = N_CONSUMER % N_PRODUCER;
        System.out.println("Mod : " +mod);

        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(BOUND);

      /*  for (int i = 0; i < N_PRODUCER; i++) {
            new Thread(new NumberProducers(blockingQueue, POISON_PILL, POISON_PILL_PER_PRODUCER)).start();
        }

        for (int i = 0; i < N_CONSUMER; i++) {
            new Thread(new NumberConsumers(blockingQueue, POISON_PILL)).start();
        }

        new Thread(new NumberProducers(blockingQueue, POISON_PILL, POISON_PILL_PER_PRODUCER + mod)).start();
*/
        Map<String, Object> map = new HashMap<>();
        System.out.println(map.put("A", 1));
        map.put("B", 2);
        System.out.println(map.put("A", 2));
        map.remove("C");

        HashSet<String> stringHashSet = new LinkedHashSet<>();
        stringHashSet.add("A");
    }
}
