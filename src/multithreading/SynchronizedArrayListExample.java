package multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedArrayListExample {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> threadSafeArrayList = Collections.synchronizedList(new ArrayList<>());
        threadSafeArrayList.add(1);
        threadSafeArrayList.add(2);
        threadSafeArrayList.add(3);

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable task = () -> {
            incrementArrayList(threadSafeArrayList);
        };

        for (int i = 0; i < 100; i++) {
            executorService.submit(task);
        }
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println(threadSafeArrayList);
    }

    private static void incrementArrayList(List<Integer> nums) {
        synchronized (nums) {
            for (int i = 0; i < nums.size(); i++) {
                nums.set(i, nums.get(i) + 1);
            }
        }
    }
}
