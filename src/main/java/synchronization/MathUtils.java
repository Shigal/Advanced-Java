package synchronization;/*
 *
 * @author Lawshiga
 *
 */

public class MathUtils {

     void getMultiples(int n) {
        synchronized (this) {
            for(int i=1; i<=5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400); // current thread is going to pause its execution for 400ms
                    // and leave the CPU idle
                    // after 400ms it is going to wake up and hunt for the idle CPU to continue its execution
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

}
