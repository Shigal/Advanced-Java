package serialization;/*
 *
 * @author Lawshiga
 *
 */

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("Kendal", 26, "Los Angelos");

        student.setId(123);

        // we are going to serialize this object onto our local file system instead of
        // sending over a network to another application

        String fileName = "C:\\Users\\HP\\Desktop\\awshigaf\\notes-docs\\java\\coding\\AdvancedJava\\src\\main\\java\\serialization\\data.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        // serialization
        try {
            fileOut = new FileOutputStream(fileName);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student); // write the object to the file using serializing
            // once it is being serialized it doesn't know it is of student class
            // so when we deserialize we need to cast it explicitly

            fileOut.close();
            objOut.close();
            System.out.println("object has been serialized \n" + student);
            // when we serialize an object the class type details is lost
            // the moment we call writeObject() it means any java object

        } catch (IOException e) {
            System.out.println("IOException is caught");
        }

        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;

        try {
            fileIn = new FileInputStream(fileName);
            objIn = new ObjectInputStream(fileIn);

            Student student1 = (Student) objIn.readObject();

            System.out.println("Object has been deserialized \n" + student1);

            System.out.println("deserialized value of id is " + student1.getId()); // deserialized value of id is 0


        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotfoundException is caught");
        }


    }
}
