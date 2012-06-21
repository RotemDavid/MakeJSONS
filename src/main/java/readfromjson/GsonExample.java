package readfromjson;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: rdavid
 * Date: 6/21/12
 * Time: 3:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class GsonExample {
    public static void main(String[] args) {
        URL url;
        Gson gson = new Gson();

        try {

            BufferedReader br = new BufferedReader(
                    new FileReader("/Users/rdavid/Desktop/Development/annotatedexample.AnnotationExample.json"));

            //convert the json string back to object
            String s = br.readLine();
            Pattern pattern = Pattern.compile("replace");
            Matcher matcher = pattern.matcher(s);

            // Check all occurance
            while (matcher.find()) {
                System.out.print("Start index: " + matcher.start());
                System.out.print(" End index: " + matcher.end() + " ");
                System.out.println(matcher.group());
            }

            // Now create a new pattern and matcher to replace whitespace with tabs
            Pattern replace = Pattern.compile("replace");
            Matcher matcher2 = replace.matcher(s);
            System.out.println(matcher2.replaceAll("test"));


            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
