package threads;/*
 *
 * @author Lawshiga
 *
 */

public class ThreadDemo {
    public static void main(String[] args) {

        int n = 10; // number of threads

        for(int i=0; i<n; i++) {
            MyThread t1 = new MyThread();
            t1.start(); // but we don't have start() in this class
            // start() is the internal method of the thread class which is in turn going to call run()
            // start() is going to change the state of thread from ready to running

            Thread t2 = new Thread(new NewThread());
            t2.start();
        }
    }
}
