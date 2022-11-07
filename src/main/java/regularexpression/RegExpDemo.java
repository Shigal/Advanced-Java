package regularexpression;/*
 *
 * @author Lawshiga
 *
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo {
    public static void main(String[] args) {
        // starts with any character occurs any number of time, following by an
        // alphabet character which is followed by a numeric digit and ends with
        // one character that can be anything
        String regexStr = ".*[a-z][0-9].";

        // compile the regex to get the Pattern object
        Pattern pattern = Pattern.compile(regexStr);

        // provide the string to be tested
        Matcher matcher = pattern.matcher("12345654adges123423"); // found
        boolean matcherFound = matcher.find();

        if(matcherFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
