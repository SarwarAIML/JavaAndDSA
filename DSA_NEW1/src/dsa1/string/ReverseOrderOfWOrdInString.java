package dsa1.string;

import java.util.Arrays;

public class ReverseOrderOfWOrdInString {

    public static void main(String[] args) {

        String str = "Welcome To Altimetrik";

        char[] chars = str.toCharArray();
        reverseWord(chars);
        System.out.println(chars);
    }

    private static void reverseWord(char[] chars) {
        int start = 0;
        for (int end = 0; end < chars.length; end++) {
            if (chars[end] ==' '){
                reverse(start,end-1,chars);
                start = end+1;
            }

        }
        reverse(start, chars.length-1,chars );
        reverse(0, chars.length-1,chars );

    }

    private static void reverse(int start, int end, char[] chars) {
        while (start <= end) {
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }
    }
}
