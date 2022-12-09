package revision;/*
 *
 * @author Lawshiga
 *
 */

public class StaticOverload {
    public static void display(){
        System.out.println("from no argument method");
    }
    public static void display(String s) {
        System.out.println("with a string arg: " + s);
    }

    // this is not possible as we already have the method with same name but that is static
//    public void display(){
//
//    }

    public static void main(String[] args) {
        display();
        display("hello");
    }
}
