package Mathematics.test;

public class PalindrumNumber {

    public static boolean isPalindrum(int num){
        int temp = num;
        int rev = 0;
        while (temp > 0){
            int r = temp % 10 ;
            temp = temp / 10;
            rev = rev *10+r;
        }
        return rev == num;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrum(151));
    }
}
