package reflection;/*
 *
 * @author Lawshiga
 *
 */

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


// name and age are private variables and no access from outside classes - can't view or change
// In Cat class, we have the field called name which has no setter, so can't set a value from outside other than from constrcutor
// and this field - name is final so once it is set can never be set to anything else
// NO WAY TO CHANGE THE NAME OF THE CAT
// BUT with REFLECTION ---> force Java to change the name of the cat

public class ReflectionDemo {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Vicky", 2);

        Field[] catFields = myCat.getClass().getDeclaredFields(); // get all fields of cat class

        for(Field field : catFields) {
            if(field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Katty"); // throws exception so make that field accessible = true
            }
        }

        Method[] catMethods = myCat.getClass().getDeclaredMethods();

        for(Method method : catMethods) {
            if(method.getName().equals("meow")){
                method.invoke(myCat); // Meow
                myCat.meow(); // Meow
            }
            if(method.getName().equals("heyThisIsPrivate")) {
                method.setAccessible(true);
                method.invoke(myCat); // throws illegal access exception so set accessible = true
            }
            // static method - no need of individual obj of that class to call that method
            if(method.getName().equals("thisIsAPrivateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null);
            }
        }

//        System.out.println(myCat.getName()); // Katty
    }
}
