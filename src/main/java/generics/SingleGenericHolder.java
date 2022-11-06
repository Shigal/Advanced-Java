package generics;/*
 *
 * @author Lawshiga
 *
 */


// whoever calls or initializes this class will have to supply the type T of the class
// on which this particular functionality gets executed
public class SingleGenericHolder<T>{

    T obj;

    SingleGenericHolder(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {

        SingleGenericHolder<Integer> iObj = new SingleGenericHolder<>(200);
        System.out.println(iObj.getObj());

        // we are reusing the same class and the same functionality for different class types
        SingleGenericHolder<String> sObj = new SingleGenericHolder<>("Java");
        System.out.println(sObj.getObj());
    }
}
