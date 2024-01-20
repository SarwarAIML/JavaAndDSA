package string;

public class AnagramCheckWith3Strings {
    public static boolean areAnagrams(String str1, String str2, String str3) {
        // If the strings are of different lengths, they cannot be anagrams
        if (str1.length() != str2.length() || str1.length() != str3.length()) {
            return false;
        }
        // ASCII character set size
        int CHAR_SET_SIZE = 256;
        int[] count = new int[CHAR_SET_SIZE];

        // Process the first string
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        // Process the second string
        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i)]++;
            count[str3.charAt(i)]--;
        }
        // Process the third string
        for (int i = 0; i < str3.length(); i++) {
            count[str3.charAt(i)]++;
            count[str1.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int i = 0; i < CHAR_SET_SIZE; i++) {
            if (count[i] != 0) {
                return false; // If any count is not zero, strings are not anagrams
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";
        String string3 = "enlist";

        if (areAnagrams(string1, string2, string3)) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are not anagrams of each other.");
        }
    }

}