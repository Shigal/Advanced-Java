package iostream;/*
 *
 * @author Lawshiga
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

    public static void main(String[] args) {

        // we are going to read and write to a file
        // whenever we use input stream we are reading from the file
        // whenever we use output stream we are writing to the file
        // and for file handling we have FileInputStream

        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try{
            inStream = new FileInputStream("C:\\Users\\HP\\Desktop\\awshigaf\\notes-docs\\java\\coding\\AdvancedJava\\src\\main\\java\\iostream\\source.txt");

            // it created the file itself and wrote the content
            outStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\awshigaf\\notes-docs\\java\\coding\\AdvancedJava\\src\\main\\java\\iostream\\destination.txt");

            // read byte by byte, if it reached the end of line, returns -1
            int content;
            while ((content = inStream.read()) != -1){
                outStream.write(content);
            }

            // it is important to close the stream as it will be present till the time
            // java runs garbage collection
            // they are costly connections and they take up lot of memory
            inStream.close();
            outStream.close();
        }
         catch (IOException e) {
             System.out.println(e);
        }

    }
}
