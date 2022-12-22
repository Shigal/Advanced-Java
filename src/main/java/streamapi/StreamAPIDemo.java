package streamapi;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 4, 7, 5, 3);
        nums.forEach(n -> System.out.println(n));

        Stream<Integer> data = nums.stream();
        long count = data.count();
        System.out.println(count); // 5
//        Stream<Integer> sortedData = data.sorted(); // won't work more than once
//        sortedData.forEach(d -> System.out.println(d)); // won't work more than once

        // we want to map each value and double it
        Stream<Integer> mappedData = data.map(i -> i*2); // mappedData is our new stream
        mappedData.forEach(n -> System.out.println(n));
    }
}
