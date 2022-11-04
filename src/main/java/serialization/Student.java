package serialization;/*
 *
 * @author Lawshiga
 *
 */

import java.io.Serializable;

public class Student implements Serializable {


    // if we implements Serializable the modern IDE asks us to add a SerialVersionUniversalID to this
    // particular class
    // so that Java can uniquely identify the object once it is serialized and deserialized
    // also it will keep track of version
    // what if someone hops over the network line and change the representation of the object and
    // the consumer application gets a completely different copy of representation
    // so it makes sure the same version that the producer application producing is received by the
    // consumer application
    // also sort of security feature

    private static final long serialVersionUID = -503962122482394581L;

    // whenever we update the object, it is going to increment the serial version id by one
    // we can also specify the value that we want to

    private String name;
    private int age;
    private String address;

    transient int id;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
