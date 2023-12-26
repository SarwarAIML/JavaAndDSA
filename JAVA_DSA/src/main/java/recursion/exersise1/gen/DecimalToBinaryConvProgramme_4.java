package recursion.exersise1.gen;

public class DecimalToBinaryConvProgramme_4 {

    public static void fun(int n){
        if (n==0)
            return;
        fun(n/2);
        System.out.print(n % 2 +" ");
    }

    public static void main(String[] args) {
           fun(7);
    }
}
