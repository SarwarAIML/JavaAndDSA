package Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithGivenSum {

    public static boolean subArrayWIthGivenSum(int[] array,int sum){
        Set set = new HashSet();
        int preFixSum = 0;
        for (int i = 0; i < array.length ; i++) {

            if (preFixSum == sum)
                return true;
            preFixSum += array[i];
            if (set.contains(preFixSum-sum)){
                return true;
            }
            set.add(preFixSum);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{5, 8, 6, 13, 3, -1};
        int sum=22;
        System.out.println(subArrayWIthGivenSum(arr, sum));
    }
}
