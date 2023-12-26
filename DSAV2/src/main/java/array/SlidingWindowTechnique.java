package array;

public class SlidingWindowTechnique {

    public static void main(String[] args) {

        int arr[] = {10,5,-2,20,1};
        int k=3;
        int maxSumNaive = maxSumNaive(arr,k);
        System.out.println("maxSumNaive:::::::::::"+maxSumNaive);

        int maxSum = maxSum(arr,k);
        System.out.println("maxSum:::::::::::"+maxSum);
    }

    private static int maxSum(int[] arr, int k) {
        int currentSum = 0;
        for (int i = 0; i <k ; i++) {
            currentSum += arr[i];
        }
        int maxSUm = currentSum;
        for (int i = k ; i < arr.length ; i++) {
                currentSum = currentSum +arr[i]-arr[i-k];
                maxSUm = Math.max(currentSum,maxSUm);
        }
        return maxSUm;
    }

    private static int maxSumNaive(int[] arr, int k) {
        int res =  Integer.MIN_VALUE;
        for (int i = 0; i+k-1 < arr.length ; i++) {
            int currSum = 0;
            for (int j = 0; j < k; j++) {
                currSum = currSum + arr[i+j];
                res = Math.max(currSum,res);
            }
        }
        return res;
    }


}
