package image;/*
 *
 * @author Lawshiga
 *
 */

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandlingDemo {

    public static void main(String[] args) {

        int width = 960;
        int height = 640;

        // we load the image from the file system and write it back to the file system from java program
        BufferedImage image = null;

        image = readFromFile(width, height, image);

        writeToFile(image);


    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image) {

        try{
            // create file object as image is also a file
            File sampleFile = new File("C:\\Users\\HP\\Desktop\\awshigaf\\notes-docs\\java\\coding\\AdvancedJava\\src\\main\\java\\image\\sample.jpg");

            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB); // 3rd is imageType which is color space

            // read the file and store the output into a BufferedImage object
            // reading the whole image into a 2D byte array and copying it into this object
            image = ImageIO.read(sampleFile);

            System.out.println("Reading complete. " + image);

        } catch (IOException e) {
            System.out.println(e);
        }
        return image;
    }

    private static void writeToFile(BufferedImage image) {
        try {
            File output = new File("C:\\Users\\HP\\Desktop\\awshigaf\\notes-docs\\java\\coding\\AdvancedJava\\src\\main\\java\\image\\out.jpg");
            ImageIO.write(image, "jpg", output);
            System.out.println("writing complete");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
