package revision;/*
 *
 * @author Lawshiga
 *
 */

public interface StaticMethodInInterface {

    // static method
    static void hello()
    {
        System.out.println("Hello, New Static Method Here");
    }

    // Public and abstract method of Interface
    void overrideMethod(String str);

}

class InterfaceDemo implements StaticMethodInInterface {

    public static void main(String[] args) {
        StaticMethodInInterface.hello();
        InterfaceDemo demo = new InterfaceDemo();
        demo.overrideMethod("we are overriding an non static method");
    }

    @Override
    public void overrideMethod(String str) {
        System.out.println(str);
    }
}
