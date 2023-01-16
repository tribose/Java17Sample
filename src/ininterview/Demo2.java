package ininterview;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Demo2 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<String>> callableList = new ArrayList<>();

        callableList.add(() -> "s1");
        callableList.add(() -> "s2");
        callableList.add(() -> "s3");
        callableList.add(() -> "s4");
        callableList.add(() -> "s5");

        try {
            List<Future<String>> resultList = executorService.invokeAll(callableList);

            for (Future<String> future: resultList) {
                System.out.println(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

    }

    /*

    @Query(value = "select * form table")

    EntityManager (datasource())

    username, pwd, driverclass, url

    SessionFactory = EntityManager.createSessionFactory();

    Session sesison = sessionfactory.createSession();

    Transaction tran = sesison.transaction()

    PrepareStatement ps = new PreparedStament(psSQLFilename/ path)

    tran.execute(ps)

    tran.close()
    session.close()
     */
}
