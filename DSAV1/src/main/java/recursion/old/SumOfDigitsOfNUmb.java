package recursion.old;

public class SumOfDigitsOfNUmb {
    public static int sumRec(int num){
        if (num <=9) return num;
        return sumRec(num/10)+num%10;
    }
    public static int sumIterative(int num){
        int res = 0;
        while (num > 0){
            res = res + num % 10 ;
            num = num / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigitsOfNUmb.sumIterative(12345));
        System.out.println(SumOfDigitsOfNUmb.sumRec(12345));
    }
}
