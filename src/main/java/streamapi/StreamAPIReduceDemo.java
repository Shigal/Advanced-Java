package streamapi;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Arrays;
import java.util.List;

public class StreamAPIReduceDemo {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, 6, 2, 8, 4, 5, 7, 1);
        int result = numberList.parallelStream() // try with parallelstream
                .filter(i -> i%2==1)
                .sorted()
                .map(i -> i*2)
                .reduce(0, (c,e) -> c+e);
        // zero is starting value, as reduce returns a value we are going to accept it
        // add zero + element gives carry then
        // carry + new element (c, e)
        System.out.println(result);



    }
}
