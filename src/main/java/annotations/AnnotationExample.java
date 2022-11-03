package annotations;/*
 *
 * @author Lawshiga
 *
 */

import java.lang.reflect.Method;

public class AnnotationExample {

    // annotations are form of metadata
    // they provide info to the compiler

    @MyCustomAnnotation(value = 20)
    public void sayHello(){
        System.out.println("my custom annotation");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationExample example = new AnnotationExample();
        Method methodVal = example.getClass().getMethod("sayHello"); // this is a way to fetch the method name or type from a class using Reflection API
        // the above line is going to search the method with this name and if it finds it will return
        // the method in this variable

        // here we are calling the method
        // using reflection api
        // if we want to fetch the value of annotation we should do it this way

        MyCustomAnnotation annotation = methodVal.getAnnotation(MyCustomAnnotation.class);
                // getAnnotation() is going to fetch any annotation applied on this particular method
        // by giving the annotation class type as well
        // by doing this we will get MyCustomAnnotation type reference
        // and if we call the value() method on this
        System.out.println("value is :" + annotation.value());
    }
}
