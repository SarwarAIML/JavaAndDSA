package list.singleLinkedList.Node.sorting;

import java.net.StandardSocketOptions;
import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static int minDiff(int arr[],int k){

        if (k > arr.length)
            return -1;
        Arrays.sort(arr);
        int minDiff = arr[k-1] - arr[0];
        for (int i = 1; (k+i-1) < arr.length ; i++) {
            minDiff = Math.min(minDiff,arr[k+i-1]-arr[i]);
        }
        return minDiff;
    }

    public static void main(String[] args) {
            int arr[] = {7,3,2,4,9,12,56};
            int minDiff = minDiff(arr,3);
        System.out.println(minDiff);
    }
}