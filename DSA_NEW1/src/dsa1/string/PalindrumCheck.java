package dsa1.string;

public class PalindrumCheck {

    static boolean  isPalindrum(String str ){

        int low = 0;
        int high = str.length()-1;
        while (low <= high) {
            if (str.charAt(low) != str.charAt(high))
                return false;
            low++;
            high--;
        }
            return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrum("madam"));
    }
}
