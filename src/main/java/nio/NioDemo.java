package nio;/*
 *
 * @author Lawshiga
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo {
    public static void main(String[] args) throws IOException {

        try {

            // create file input stream
            FileInputStream fin = new FileInputStream("C:\\Users\\HP\\Desktop\\awshigaf\\notes-docs\\java\\coding\\AdvancedJava\\src\\main\\java\\nio\\Theory.txt");

            // create a file channel as we are reading a file
            // file channel is generic to read and write
            FileChannel readChannel = fin.getChannel();

            // create a buffer and allocate starting size
            ByteBuffer readBuffer = ByteBuffer.allocate(2048); // 2MB

            int result = readChannel.read(readBuffer);
            System.out.println("file read successfully " + result); //file read successfully 775
            // it read 775 Bytes


            //-------------------------------------------------------------------------------------

            FileOutputStream fout = new FileOutputStream("C:\\Users\\HP\\Desktop\\awshigaf\\notes-docs\\java\\coding\\AdvancedJava\\src\\main\\java\\nio\\dest.txt");
            FileChannel writeChannel = fout.getChannel();
            ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
            String message = "this is a test";
            writeBuffer.put(message.getBytes());
            writeBuffer.flip(); // to reset the index
            writeChannel.write(writeBuffer);
            System.out.println("file written successfully");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
