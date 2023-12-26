package dsa1.sorting;

import java.util.Arrays;

public class MinimumDifferenceInArray {

    public static int getMinValue(int arr[]){
        int minValue = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length ; i++) {
            minValue = Math.min(minValue,arr[i]-arr[i-1]);
        }
        return minValue;
    }

    public static void main(String[] args) {
            int arr[] = {2,10,17,5,28};
        int minValue = getMinValue(arr);
        System.out.println(minValue);

    }
}
