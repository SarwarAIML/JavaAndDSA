package String;

import java.util.Arrays;


/**
 * An anagram of a String is another String that contains the same characters,
 * only the order of characters can be different.
 * For gs, “abcd” and “dabc” are an anagram of each other.
 */
public class Anagram {

    static final int CHAR=256;
    /**
     *
     * @param s1
     * @param s2
     * @return
     * Naive Code
     */
    public static boolean isAnagram(String s1,String s2){
        if (s1.length() !=s2.length()) return false;
        char[] ch1 = s1.toCharArray();
        char[] ch2= s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str1 = new String(ch1);
        String str2 = new String(ch2);
        return str1.equals(str2);
    }
    public static boolean isAnagramIterative(String s1,String s2){

        if (s1.length()!=s2.length()) return false;

        int[]  count = new int[CHAR];
        for (int i = 0; i <CHAR ; i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i = 0; i <CHAR ; i++) {
            if (count[i] !=0) return false;
        }
        return true;
    }
}