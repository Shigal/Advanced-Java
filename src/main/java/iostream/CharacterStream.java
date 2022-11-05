package iostream;/*
 *
 * @author Lawshiga
 *
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) {

        FileReader reader = null;
        FileWriter writer = null;

        try {
            // it is important to give absolute path
            reader = new FileReader("C:\\Users\\HP\\Desktop\\awshigaf\\notes-docs\\java\\coding\\AdvancedJava\\src\\main\\java\\iostream\\source.txt");
            writer = new FileWriter("C:\\Users\\HP\\Desktop\\awshigaf\\notes-docs\\java\\coding\\AdvancedJava\\src\\main\\java\\iostream\\destination.txt");

            int content;
            while((content = reader.read()) != -1){
                writer.append((char) content);
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
