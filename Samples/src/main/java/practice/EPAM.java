package practice;

import java.util.Arrays;

public class EPAM {

    public static void main(String[] args) {

      int ar1[] = { 1, 5, 10, 20, 40, 80 };
        int ar2[] = { 5, 6, 7, 20, 30, 40, 50, 80 };
        int ar3[] = { 3, 4, 15, 20, 30, 40, 50, 60, 77, 80 };
        int ar4[] = { 3, 4, 15, 20, 30, 40, 50, 60, 77,78,79, 80 };
         int[]c1 = merge(ar1,ar2);
         int[] c2= merge(c1,ar3);
        int[] c3= merge(c2,ar4);
        System.out.println(c3.length);
        System.out.println(Arrays.toString(c3));
        for (int i = 1; i < c3.length; i++) {
            if (c3[i] == c3[i-1]){
              continue;
            }else {
                System.out.println(c3[i]);
            }
        }

        /*
        int price[] = { 20,10,20,30,40,50,80,10,90 };
        purchase at day 1 and sell at day 1 and your profit is 0
        purchase at day 2 and sell at day 7 and your profit is 70
        purchase at day 8 and sell at day 9 and your profit is 150
    */
        int prices[] = { 20,10,20,30,40,50,80,10,90 };
        findprice(prices);
    }

    private static void findprice(int[] prices) {
        int totalProfit = 0;
        int buyingDay = 0;
        int sellingDay = 0;

        for (int i = 1; i <prices.length ; i++) {

            if (prices[i] > prices[i-1]){
                totalProfit += prices[i] - prices[i - 1];
                sellingDay = i;
            }else {
                if (sellingDay >= buyingDay){
                    printTransaction(buyingDay, sellingDay, totalProfit);
                }
                buyingDay = sellingDay = i;
            }
        }
        if (totalProfit ==0)
            System.out.println("No profitable transaction");
        if (sellingDay >= buyingDay)
            printTransaction(buyingDay,sellingDay,totalProfit);

    }

    private static void printTransaction(int buyingDay, int sellingDay, int totalProfit) {
        System.out.println("purchage day : "+ (buyingDay+1 )+ " and sell day at "+
                (sellingDay+1)+" and total profit is "+ totalProfit);
    }

    public static int[] merge(int[] a,int[] b){

        int i = 0;
        int j = 0;
        int k = 0;

        int c[] = new int[a.length+b.length] ;

        while (i < a.length && j < b.length){
            if (a[i] < b[j]){
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length){
            c[k++] = a[i++];
        }
        while (j < b.length){
            c[k++] = b[i++];
        }
        return c;
    }
}
