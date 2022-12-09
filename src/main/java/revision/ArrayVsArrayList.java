package revision;/*
 *
 * @author Lawshiga
 *
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(); // shrink and grow
        // Arrays.asList(2,3,5,2) is immutable but passing it into ArrayList
        // immutable = x add x remove
        // makes it resizable
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,3,5,2));
        // Arrays has fixed size
        // ArrayList has dynamic size
        // Array can hold primitives or objects
        // ArrayLis can only hold objects but supports wrapper types for primitives
        // to get values
        // Array uses index and ArrayList uses method get()
        // get size
        // Array length, ArrayList size()
        // we can set a new value of Array
        // for ArrayList use set(index, value);
        // Array can't remove elements due to fixed size
        // ArrayList remove(index) or remove(element)
        // when we print the Array, it gives the memory address of that array
        // when we print the ArrayList gives elements
        // ArrayList is a part of Collection

        ArrayList list1 = new ArrayList();
        list1.add("sere");
        list1.add(2);
        list1.add('w');
        list1.add(false);
        System.out.println(list1);

    }
}
