package Mathematics.test;

public class AllDivisorsOfANumber {

    public static void printAllDivisorUnSorted(int n){

        for (int i = 1; i*i <=n ; i++) {
            if (n % i == 0){
                System.out.print(i+" ");
                if (i != n/i)
                    System.out.print((n/i) + " ");
            }
        }
    }
    
    public static void printAllDivisorInSortedOrder(int n){
        int i = 1;
        for ( i = 1; i*i <n ; i++) {
            if (n % i == 0)
                System.out.print(i+" ");
        }
        for ( ; i >=1  ; i--) {
            if (n % i == 0)
                System.out.print(n / i+" ");
        }
    }

    public static void main(String[] args) {

        printAllDivisorUnSorted(25);
        System.out.println("----------------");
        printAllDivisorInSortedOrder(25);
    }
}
