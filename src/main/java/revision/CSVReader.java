package revision;/*
 *
 * @author Lawshiga
 *
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String path = "C:\\Users\\HP\\Desktop\\awshigaf\\notes-docs\\java\\coding\\AdvancedJava\\src\\main\\java\\revision\\annual-enterprise-survey-2021-financial-year-provisional-csv.csv";
        String line = "";

        try {
            // we can do the same with Scanner
            // but Scanner is slower than BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                System.out.println(values[0]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("this file doesn't exit");
        } catch (IOException e) {
            System.out.println("couldn't read the line");
        }
    }
}
