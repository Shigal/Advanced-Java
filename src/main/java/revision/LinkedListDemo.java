package revision;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(21);
        list.add(22);
        list.add(23);

        list.forEach(System.out::println);

        list.remove();
        list.forEach(System.out::println);

        list.add(2, 222);
        list.forEach(System.out::println);

        ListIterator<Integer> iterator = list.listIterator();

        System.out.println("using list iterator");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---------------------------------");

        List<Integer> myList = Arrays.asList(2, 4, 6, 7, 2);

        Integer[] names = new Integer[myList.size()];
        myList.toArray(names);
        System.out.println(names[0]);

    }
}
