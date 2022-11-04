package synchronization;/*
 *
 * @author Lawshiga
 *
 */

public class Thread1 extends Thread{

    MathUtils mathUtils;

    public Thread1(MathUtils mathUtils) {
        this.mathUtils = mathUtils;
    }

    @Override
    public void run() {
        try {
            mathUtils.getMultiples(2);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
