package threads;/*
 *
 * @author Lawshiga
 *
 */

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            // there won't be exception coming in but we are checking it here
            System.out.println("MyThread is running");
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
