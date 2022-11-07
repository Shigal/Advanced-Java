package concurrency;/*
 *
 * @author Lawshiga
 *
 */

import java.io.IOException;
import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(10000);
            return "completed";
        });

        // whatever in while is checking the status of line 18-21
        // normally in synchronous program it takes it in the order as written
        // here it is asynchronous, we can consider 18-21 as a separate program

        try {
            while (!future.isDone()) {
                System.out.println("Task still in progress . . . wait");
                Thread.sleep(500);
            }

            System.out.println("Task completed!");

            // after task is completed fetching the result
            // takes the future object state
            String result = future.get(3000, TimeUnit.MICROSECONDS);
            System.out.println(result);

            // release the thread pool
            executorService.shutdown();
        }
        catch (InterruptedException | ExecutionException | TimeoutException e) {
            // explicitly cancel a future task which is in progress
            future.cancel(true);
            future.isDone();
            future.isCancelled();

        }
    }
}
