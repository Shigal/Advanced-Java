package enums;/*
 *
 * @author Lawshiga
 *
 */

public class EnumExample {
    public static void main(String[] args) {
        Color c1 = Color.RED;

        System.out.println("Red enum name: " + c1.name());
        System.out.println("Red enum value: " + c1.getValue());

        for(Color c : Color.values()){
            System.out.println("Enum value - " + c.getValue() + "name[" + c.name() + "]");
        }
    }
}
