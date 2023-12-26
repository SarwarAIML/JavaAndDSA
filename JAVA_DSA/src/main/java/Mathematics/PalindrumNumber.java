package Mathematics;

public class PalindrumNumber {
    public static void main(String[] args) {
        System.out.println("number is palindrum or not :: "+PalindrumNumber.isPalindrumNumber(363));
    }

    public static boolean isPalindrumNumber(int num){
        int sum = 0 ;
        int temp = num ;
        while (temp > 0){
            int r = temp % 10 ;
            temp = temp / 10 ;
            sum = sum * 10 + r;
        }
        return sum==num;
    }
}
