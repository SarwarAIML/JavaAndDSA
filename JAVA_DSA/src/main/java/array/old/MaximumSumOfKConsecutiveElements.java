package array.old;

public class MaximumSumOfKConsecutiveElements {

    /**
     *
     * @param arr
     * @param n
     * @param k
     * @return
     * Sliding Window Technique
     * Maximum Sum of K Consecutive elements(Efficient)
     */
    public static int maxSum(int arr[],int n,int k){
        int current_sum = 0;
        for (int i = 0; i <k ; i++)
            current_sum +=arr[i];
        int max_sum = current_sum;

        for (int i = k; i <n ; i++) {
            current_sum +=arr[i]-arr[i-k];
            max_sum = Math.max(max_sum,current_sum);
        }
        return max_sum;
    }


    public static void main(String args[])
    {
        int arr1[] = {1, 8, 30, -5, 20, 7}, n1 = 6, k1 = 3;
        System.out.println(maxSum(arr1, n1, k1));
    }
}
