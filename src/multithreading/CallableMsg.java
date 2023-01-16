package multithreading;

import java.util.concurrent.Callable;

public class CallableMsg implements Callable<String> {

    public String call() throws Exception {
        return "demo";
    }
}
