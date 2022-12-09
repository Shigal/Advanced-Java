package revision;/*
 *
 * @author Lawshiga
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String args[]) {
//        List<Integer> numbers = Arrays.asList(2, 4, 6, 7, 8, 2);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<5; i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            int i = iterator.next();
            System.out.print(i + " ");
            if(i%2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(list);
//        iterator.remove();// won't work
    }
}
