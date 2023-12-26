package array;

public class StockBuySellNaive {

    public static void main(String[] args) {

        int arr[] = {1, 5, 3, 8, 12} ;

        int maxProfitNaive = maxProfitNaive(arr,0,arr.length-1);
        System.out.println("maxProfitNaive::::::::"+maxProfitNaive);
        int maxProfit = maxProfit(arr);
        System.out.println("maxProfit:::::::::"+maxProfit);
    }

    private static int maxProfitNaive(int[] price, int start, int end) {
        if (end <= start)
            return 0;
        int profit = 0 ;
        for (int i = start; i < end; i++) {
            for (int j = i+1; j <= end ; j++) {
                if (price[j] > price[i]){

                    int current_profit = price[j]-price[i] + maxProfitNaive(price,start,i-1)+maxProfitNaive(price,j+1,end);
                    profit = Math.max(current_profit,profit);
                }

            }
        }
        return profit;
    }

    public static int maxProfit(int price[]){
        int profit = 0 ;
        for (int i = 1; i < price.length ; i++) {
            if (price[i] > price[i-1])
                profit = profit + (price[i] - price[i-1]) ;
        }
        return profit ;
    }
}
