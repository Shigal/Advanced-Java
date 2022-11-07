package concurrency;/*
 *
 * @author Lawshiga
 *
 */

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainDemo {
    public static void main(String[] args) {
        executorInvoke();
        executorServiceInvoke();
    }

    private static void executorInvoke(){
        Executor executor = new Caller();

        // using lambda function
        // stating what exactly we want it to do when we run this particular thread
        executor.execute(() -> System.out.println("executor example"));

    }

    private static void executorServiceInvoke(){
        // create a pool of threads dedicated to do the tasks whichever given
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> System.out.println("executor service example"));
    }
}


