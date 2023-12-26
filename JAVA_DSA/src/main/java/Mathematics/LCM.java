package Mathematics;

public class LCM {

    public static int lcm(int a,int b){
        int result = Math.max(a,b);
        while (true){
            if (result % a ==0 && result % b == 0 ){
                break;
            }
            result++;
        }
        return result;
    }

    public static int lcm1(int a,int b){
        return (a*b)/gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if (b==0){
            return a;
        }else {
            return gcd(b,a%b);
        }
    }

}
