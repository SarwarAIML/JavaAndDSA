package array;

public class MaximumSubArraySum {

    public static void main(String[] args) {

        int[] arr = {-3, 8, -2, 4, -5, 6};
        int maxSubArraySumNaive = maxSubArraySumNaive(arr);
        System.out.println("maxSubArraySumNaive::"+maxSubArraySumNaive);

        int maxSubArraySum = maxSubArraySum(arr);
        System.out.println("maxSubArraySum::"+maxSubArraySum);
    }

    private static int maxSubArraySum(int[] arr) {
        int maxEnding = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {

            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            maxSum = Math.max(maxSum,maxEnding);
        }
        return maxSum;
    }

    private static int maxSubArraySumNaive(int[] arr) {
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum = currentSum + arr[j];
                maxSum = Math.max(currentSum,maxSum);
            }
        }
        return maxSum;
    }

}
