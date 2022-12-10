package revision;/*
 *
 * @author Lawshiga
 *
 */

public class PolymorphicVariable {

}
class ProgrammingLanguage {
    public void display() {
        System.out.println("I am Programming Language.");
    }
}
class Java extends ProgrammingLanguage {
    @Override
    public void display() {
        System.out.println("I am Object-Oriented Programming Language.");
    }
}
class Main {
    public static void main(String[] args) {
        // declare an object variable
        ProgrammingLanguage pl;
        // create object of ProgrammingLanguage
        pl = new ProgrammingLanguage();
        pl.display();
        // create object of Java class
        pl = new Java();
        pl.display();
    }
}