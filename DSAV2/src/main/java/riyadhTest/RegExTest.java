package riyadhTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

    public static void main(String[] args) {
        String string ="Kim Romos:4 5 6";

          String regex = "(\\d{2}:\\d{2})[\\W]+(\\d{2}:\\d{2})[\\W]+(.*)";

        String[] events = new String[]{
                "9:00 : 10:00- Exercise",
                "10:00 @ 11:00 $ Meeting",
                "11:15 ? 12:30 /Lunch",
                "13:00 * 15:00 # Task 1",
                "15:15 - 16:00 Tahalla",
                "15:30 - 16:00 Appointment",
                "17:00 - 18:00 Dinner"

        };

        String arrayString = splitString(events);
        System.out.println(arrayString);
       // for ()
    }

    private static String splitString(String[] events) {
        //String regex = "(\\d{2}:\\d{2})[^[^a-zA-Z0-9]+$]+(\\d{2}:\\d{2})[^[^a-zA-Z0-9]+$]+(.*)";
        String regex = "(\\d{2}:\\d{2})[\\W]+(\\d{2}:\\d{2})[\\W]+(.*)";
  //      Matcher matcher = Pattern.compile(regex).matcher()
        String[] split = null;
       for (String string : events){
           Matcher matcher = Pattern.compile(regex).matcher(string);
           String string1 = matcher.group(1);
           String string2 = matcher.group(1);
           String string3 = matcher.group(1);
           System.out.println(string1);
           System.out.println(string2);
           System.out.println(string3);
       }
       StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(split);
       return stringBuilder.toString();
    }
}
