package array.old;

public class MaximumSubArraySum {

    /**
     *
     * @param array
     * @return
     * Kadane's Algorithm
     */
    static int maxSum(int[] array){
        int maxSum = array[0];
        int maxEndingSum = array[0];

        for (int i = 1; i <array.length ; i++) {
            maxEndingSum = Math.max(maxEndingSum+array[i],array[i]);
            maxSum = Math.max(maxEndingSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String args[])
    {
        int arr[] = {1, -2, 3, -1, 2}, n = 5;
        int arr1[] = {-5, 4, 6, -3, 4,-1};

        System.out.println(maxSum(arr));
        System.out.println(maxSum(arr1));

    }
}
