package revision;/*
 *
 * @author Lawshiga
 *
 */

public class OrderOfExecution {

}
class GFG {

    GFG(int x)
    {
        System.out.println("ONE argument constructor");
    }

    GFG()
    {
        System.out.println("No  argument constructor");
    }

    static
    {
        System.out.println("1st static initialization block");
    }

    {
        System.out.println("1st instance initialization block");
    }

    {
        System.out.println("2nd instance initialization block");
    }

    static
    {
        System.out.println("2nd static initialization block");
    }

    public static void main(String[] args)
    {
        new GFG();
        new GFG(8);
    }
//
//    1st static initialization block
//    2nd static initialization block
//    1st instance initialization block
//    2nd instance initialization block
//    No  argument constructor


//    1st instance initialization block
//    2nd instance initialization block
//    ONE argument constructor


}
