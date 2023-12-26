package dsa1.array;

public class LongestEvenOddSubArray {

    public static void main(String[] args) {

        int[] arr = {10,12,14,7,8};
        int maxEvenOddNaive = maxEvenOddNaive(arr);
        System.out.println("maxEvenOddNaive::::::::"+maxEvenOddNaive);
        int maxEvenOdd = maxEvenOdd(arr);
        System.out.println("maxEvenOdd::::::::"+maxEvenOdd);
    }

    private static int maxEvenOdd(int[] arr) {

        int maxEvenOdd = 1;
        int currentMaxEvenOdd = 1;
        for (int i = 1; i < arr.length ; i++) {
            if ((arr[i]%2 == 0 && arr[i-1] % 2 !=0) ||  (arr[i] % 2 != 0 && arr[i-1] % 2 ==0) ){
                currentMaxEvenOdd ++;
                maxEvenOdd = Math.max(maxEvenOdd,currentMaxEvenOdd);
            }else {
                currentMaxEvenOdd = 1;
            }
        }
        return maxEvenOdd;
    }

    private static int maxEvenOddNaive(int[] arr) {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            int curr = 1 ;
            for (int j = i+1; j < arr.length ; j++) {
                if ((arr[j] % 2 == 0 && arr[j-1] %2 != 0) || (arr[j] % 2 != 0 && arr[j-1] %2 == 0)){
                    curr ++;
                }else {
                    break;
                }
            }
            res = Math.max(curr,res);
        }
        return res;
    }
}
