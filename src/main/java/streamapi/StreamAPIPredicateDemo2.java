package streamapi;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamAPIPredicateDemo2 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, 6, 2, 8, 4, 5, 7, 1);

//        Function<Integer, Integer> function = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer i) {
//                return i*2;
//            }
//        };

        Function<Integer, Integer> function =  i -> i*2;


        numberList.stream()
                .filter(i -> i%2==1)
                .sorted()
                .map(function)
                .forEach(i -> System.out.println(i));
    }
}
