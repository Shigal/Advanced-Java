package streamapi;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPIPredicateDemo {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(3, 6, 2, 8, 4, 5, 7, 1);

        // Predicate is a functional interface
        // create an anonymous class

//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if(integer % 2 == 1) {
//                    return true;
//                }
//                return false;
//            }
//        };

        // alter it into lambda expression
        Predicate<Integer> predicate = integer -> integer%2==1;

        numberList.stream()
                .filter(predicate)
                .sorted()
                .map(i -> i*2)
                .forEach(i -> System.out.println(i));
    }
}
