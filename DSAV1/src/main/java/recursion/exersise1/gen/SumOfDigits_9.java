package recursion.exersise1.gen;

public class SumOfDigits_9 {

    public static int getSum(int n){
        if (n<=9)
            return n;
        return getSum(n/10)+n%10;
    }

    public static int getSumIte(int n){
        int sum = 0 ;
        while (n> 0){
            sum = sum + n%10;
            n = n /10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum(253));
        System.out.println(getSumIte(253));
    }
}
