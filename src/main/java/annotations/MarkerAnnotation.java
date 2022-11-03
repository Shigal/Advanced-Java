package annotations;/*
 *
 * @author Lawshiga
 *
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MarkerAnnotation {

    // marker annotation is an empty annotation without having any meta data logic

    // to give very high level instructions to the compiler
    // whenever we want to create our custom annotation use the keyword @interface

    // we also need to specify when to execute this annotation and what annotation type is going to be
    // @Retention(RetentionPolicy.RUNTIME) - processed at runtime
    // @Retention(RetentionPolicy.Source) - processed at compile time

    // 2nd thing we need to provide is where this annotation is going to be applied
    // like to a class, a method, a member variable, etc
    // @Target(ElementType.TYPE) - applied to a class type in general


}
