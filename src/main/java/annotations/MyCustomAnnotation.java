package annotations;/*
 *
 * @author Lawshiga
 *
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



// this annotation is only applied to methods
// and we declared a method called value()

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyCustomAnnotation {
    int value();
}
