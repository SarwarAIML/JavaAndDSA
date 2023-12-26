package recursion.old;

public class PrintNTo1 {
    public static void printN_one(int n){
        if (n==0) return;
        System.out.print(n+ " ");
        printN_one(n-1);
    }

    public static void printOne_N(int n){
        if (n==0)
            return;
        printOne_N(n-1);
        System.out.print(n+" ");
    }
    public static void printOneN_WithTailRecurssion(int n,int k){
        if (n==0)
            return;
        System.out.println(k);
        printOneN_WithTailRecurssion(n-1,k+1);
    }

    public static void main(String[] args) {
        PrintNTo1.printN_one(4);
        System.out.println();
        PrintNTo1.printOne_N(4);
        System.out.println();
        PrintNTo1.printOneN_WithTailRecurssion(5,1);
    }
}
