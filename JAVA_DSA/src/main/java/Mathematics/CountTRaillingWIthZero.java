package Mathematics;

public class CountTRaillingWIthZero {

    public static int countTrailingZeros(int n){
        int res = 0 ;
        for (int i = 5; i <=n ; i=i*5) {
                res = res + (n/i) ;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("counting number of trailing zero:::"+CountTRaillingWIthZero.countTrailingZeros(251));
    }
}
