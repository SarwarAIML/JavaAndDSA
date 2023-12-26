package org.example.epam;


public class StockBuySell {
    public static void main(String[] args) {
        int price[] = {20, 10, 20, 30, 40, 50, 80, 10, 90};

        findMaxProfit(price);

        //
    }
    private static void findMaxProfit(int[] prices) {
        int n = prices.length;

        if (n < 2) {
            System.out.println("Not enough days to make a profit");
            return;
        }

        int buyingDay = 0;
        int sellingDay = 0;
        int totalProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] < prices[i - 1]) {
                if (sellingDay >= buyingDay) {
                    printTransaction(buyingDay, sellingDay, totalProfit);

                }
                buyingDay = sellingDay = i;
            } else {
                sellingDay = i;
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        if (sellingDay >= buyingDay) {
            printTransaction(buyingDay, sellingDay, totalProfit);
        }

        if (totalProfit == 0) {
            System.out.println("No profitable transactions");
        }
    }

    private static void printTransaction(int buyingDay, int sellingDay, int totalProfit) {
        System.out.println("Purchase at day " + (buyingDay + 1) +
                " and sell at day " + (sellingDay + 1) +
                " and your profit is " + totalProfit);
    }
}





