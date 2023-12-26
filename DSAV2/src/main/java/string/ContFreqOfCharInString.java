package string;

import java.util.Arrays;

public class ContFreqOfCharInString {

    public static void printFrequencyOfCharInString(String str){

        int[] count = new int[26];
        for (int i = 0; i <str.length() ; i++) {
            count[str.charAt(i) -'a']++;
        }
        System.out.println(Arrays.toString(count));
        for (int i = 0; i < 26; i++) {
           if (count[i]>0)
               System.out.println((char) (i+'a') +" ::"+count[i]);
        }
    }

    public static void main(String[] args) {
          String str = "geekforgeeks";
          printFrequencyOfCharInString(str);

    }
}
