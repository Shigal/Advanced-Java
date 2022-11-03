package enums;/*
 *
 * @author Lawshiga
 *
 */

public enum Color {
    // here we are going to define the value of enum types which is
    // completely optional
    // name of the enum type is constant which is a placeholder but it can have an internal value
    // what the consumer sees is the thing in capital bold letters but what actually used inside the application is
    // what is inside the brackets here
    // WHO("World Health Organization")
    // we define a constant with its value which is to be read by the internal application
    // for that we need to write some extra codes

    RED("red"), GREEN("green"), BLUE("blue");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
