package streamapi;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo2 {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(3, 6, 2, 8, 4, 5, 7);
//        Stream<Integer> data = numberList.stream();
//        Stream<Integer> mappedData = data.map(i -> i*2);
//        System.out.println(mappedData.count()); // works all the time
//        mappedData.forEach(n -> System.out.println(n));

        // get the list, apply steam operation which creates a stream
        // we apply sorted and it creates a new steam
        // on that new stream we apply a map which will double the value
        // it will create a new stream, on that we are running a foreach
        // In total it has 3 steams
        // even if we use 3 streams it is not wasting the memory
        // the moment we use 1st stream it's gone now, we are not duplicating it we are replacing it
        // in design pattern this is called builder pattern - arrangement of methods
        // double the value only if it is an odd number
        numberList.stream()
                .filter(n -> n%2==1)
                .sorted()
                .map(i -> i*2)
                .forEach(n -> System.out.println(n));
    }
}
