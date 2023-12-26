package Mathematics.test;

public class CountDigits {

    public static int countDigits(int number){
        int count = 0;
        while (number>0){
            number = number/10;
            count++;
        }
        return count;
    }

    public static int getDigitCounts(int number,int count){
        if (number==0)
            return count;
        return getDigitCounts(number/10,count+1);
    }

    public static void main(String[] args) {
        System.out.println(countDigits(25));
        System.out.println(countDigits(105));
        System.out.println(getDigitCounts(1005,0));
    }
}
