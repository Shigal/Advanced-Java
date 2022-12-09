package revision;/*
 *
 * @author Lawshiga
 *
 */

public class EqualsVsHashCode {
    public static void main(String args[]) {
        // e1 and e2 are logically same as they have same id and name
        // what is shallow comparison

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("John");

        Employee e2 = new Employee();
        e2.setId(1);
        e2.setName("John");

        System.out.println("Shallow comparison: " + (e1 == e2)); // false
        // here == does the memory comparison
        // since we used new to create the object e1 and e2 are different objects

        System.out.println("Deep comparison:  " + (e1.equals(e2))); // false
        // compares the internal details
    }
}

class Employee {
    // java.lang.Object class has equals method, we can override
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o){
        // check if object is null or not even an object of Employee class
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        if(o == this) {
            // if o is same as the current object
            // returns true if they are pointing the same memory location
            return true;
        }
        Employee e = (Employee) o;
        // based on id
        return (this.getId() == e.getId());

    }

    public int hashCode(){
        return getId();
    }
}