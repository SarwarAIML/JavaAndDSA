package recursion.exersise1.gen;

public class PrintOneToN_6 {
    public static void printOneTon(int n){
        if (n == 0)
            return;
        printOneTon(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printOneTon(4);
    }
}
