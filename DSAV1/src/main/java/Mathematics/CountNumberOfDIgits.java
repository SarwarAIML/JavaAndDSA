package Mathematics;

public class CountNumberOfDIgits {

    public static void main(String[] args) {
        System.out.println("number of digits are ::"+ CountNumberOfDIgits.countDigits1(12345));
        System.out.println(countDigits2(123456,0));
    }

    public static int countDigits1(int n){
        int counter = 0 ;
        while (n>0){
            n = n/10;
            counter ++;
        }
        return counter;
    }

    static int countDigits2(int n, int counter){
        if(n==0) return counter;
        return countDigits2(n/10,counter+1);
    }
}
