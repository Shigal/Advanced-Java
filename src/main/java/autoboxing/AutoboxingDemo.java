package autoboxing;/*
 *
 * @author Lawshiga
 *
 */

public class AutoboxingDemo {
    public static void main(String[] args) {

        int i = 100;

        // autoboxing
        Integer iObj = Integer.valueOf(i);
        System.out.println("value of Integer object : " + iObj);

        //auto-unboxing
        int i1 = iObj;
        System.out.println("value of i1 : " + i1);

        char ch = 'b';
        // autobox
        Character charObj = Character.valueOf(ch);

        // auto-unbox
        char c = charObj;
        System.out.println("value of charObj : " + charObj);
        System.out.println("value of char : " + c);
    }
}
