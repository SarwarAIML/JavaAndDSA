package dsa1.string.pattern;

import java.util.Arrays;

public class firstRepeatingCharinString {
    
    public static char firstRpeatingCharInString(String string) {

        int count[] = new int[256];
        for (int i = 0; i < string.length(); i++) {
            System.out.println(Arrays.toString(count));
            System.out.println(string.charAt(i));
            count[string.charAt(i)]++;
        }
        for (int i = 0; i < string.length(); i++) {
            if (count[string.charAt(i)] > 1) {
                return string.charAt(i);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String string = "Java is programming Language";
        char c = firstRpeatingCharInString(string);
        System.out.println(c);
    }
}
