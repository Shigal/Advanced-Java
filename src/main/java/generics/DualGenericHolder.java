package generics;/*
 *
 * @author Lawshiga
 *
 */


// this class can accept multiple generic types
// we can have any number of generic types we want
// hashmap has the exact same concept
public class DualGenericHolder <T, U>{

    T tObj;
    U uObj;

    DualGenericHolder(T tObj, U uObj){
        this.tObj = tObj;
        this.uObj = uObj;
    }

    public void display(){
        System.out.println(tObj);
        System.out.println(uObj);
    }

    public static void main(String[] args) {

        DualGenericHolder<Integer, String> obj = new DualGenericHolder<>(727333, "HI!");
        obj.display();
    }
}
