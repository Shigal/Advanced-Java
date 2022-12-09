package string;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {

        String str1 = "if you want it bad enough, ";
        String str2 = "you will get it";

        System.out.println(str1.length());

        String result = str1.concat(str2);
        System.out.println(result);

        // to supply dynamic values inside static string
        String line = String.format("The name of the author is " + "%s, and the age is " + "%d" , "Ray Dalio", 73);
        System.out.println(line);

        System.out.println(line.charAt(4));

        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");

        // s1, s2 in Java Constant Pool in the Heap
        // s3 in Java Heap

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        System.out.println(s1.indexOf('a')); // if the character is not present output is -1
        //as 'a' is present more than once but we got the index of first occurrence

        // we are doing the manipulation
        // not overridden but a new object is created
        System.out.println(s1.replace('v', 'k'));

        String[] arr = str1.split(" "); // splitting the string whenever it encounters a space
        Arrays.asList(arr).forEach(s -> System.out.println(s)); // here we are using Stream API to iterate over the array

        String newStr1 = str1.substring(3, 6);
        System.out.println(newStr1);
    }
}
