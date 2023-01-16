package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> result = executorService.submit(new CallableMsg());
        /*executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);*/
        System.out.println(result.get());
    }
}
